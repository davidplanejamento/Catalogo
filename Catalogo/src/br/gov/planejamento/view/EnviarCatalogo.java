package br.gov.planejamento.view;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import br.gov.planejamento.bean.LevantamentoSistemasConsolidado;
import br.gov.planejamento.controller.LerPlanilha;
import br.gov.planejamento.dao.ManterArquivoOrgao;
import br.gov.planejamento.dao.ManterListaLevantamento;

/**
 * Servlet implementation class EnviarCatalogo
 */
@WebServlet("/EnviarCatalogo")
@MultipartConfig(fileSizeThreshold = 1024*1024*2,//2MB
					maxFileSize = 1024*1024*10, //10MB
					maxRequestSize = 1024*1024*50) //50MB
public class EnviarCatalogo extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
	private static final String SAVE_DIR = "uploadFiles";
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnviarCatalogo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		// gets absolute path of the web application
        String appPath = request.getServletContext().getRealPath("");
        // constructs path of the directory to save uploaded file
        String savePath = appPath + File.separator + SAVE_DIR;
        String fileName ="";
        
        // creates the save directory if it does not exists
        File fileSaveDir = new File(savePath);
        if (!fileSaveDir.exists()) {
            fileSaveDir.mkdir();
        }
        
        
        LerPlanilha lp = new LerPlanilha();
        for (Part part : request.getParts()) {
        	fileName = extractFileName(part);
        	part.write(savePath + File.separator + fileName);
        }
        
        String urlFile = savePath + File.separator + fileName;
        File file = new File(urlFile);
        InputStream inputStream = new FileInputStream(file);
        
        LevantamentoSistemasConsolidado lista = new LevantamentoSistemasConsolidado();
        ManterListaLevantamento manterLista = new ManterListaLevantamento();
        ManterArquivoOrgao manterArquivo = new ManterArquivoOrgao();
        
        try{
        	lista = lp.readODS(file);
        	manterLista.inserirListaLevantamento(lista);
        	manterArquivo.inserirArquivo(lista.getSIORG(), inputStream);
        	request.setAttribute("message", "Planilha carregada e validada com sucesso!");
        }catch (RuntimeException re){
        	request.setAttribute("messageError", re.getMessage());
        } finally{
        	getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
        }
	}
	
	private String extractFileName(Part part) {
        String contentDisp = part.getHeader("content-disposition");
        String[] items = contentDisp.split(";");
        for (String s : items) {
            if (s.trim().startsWith("filename")) {
                return s.substring(s.indexOf("=") + 2, s.length()-1);
            }
        }
        return "";
    }

}
