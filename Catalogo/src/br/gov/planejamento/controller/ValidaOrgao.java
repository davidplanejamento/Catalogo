package br.gov.planejamento.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;

public class ValidaOrgao {

	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	public ValidaOrgao() {
		hm.put(46, "ADVOCACIA GERAL DA UNIÃO – AGU");
		hm.put(45104, "AGÊNCIA BRASILEIRA DE INTELIGÊNCIA – ABIN");
		hm.put(4243, "AGÊNCIA ESPACIAL BRASILEIRA – AEB");
		hm.put(46876, "AGÊNCIA NACIONAL DE ÁGUAS – ANA");
		hm.put(86144, "AGÊNCIA NACIONAL DE AVIAÇÃO CIVIL – ANAC");
		hm.put(21089, "AGÊNCIA NACIONAL DE ENERGIA ELÉTRICA – ANEEL");
		hm.put(45013, "AGÊNCIA NACIONAL DE SAÚDE SUPLEMENTAR – ANS");
		hm.put(25064, "AGÊNCIA NACIONAL DE TELECOMUNICAÇÕES – ANATEL");
		hm.put(54843, "AGÊNCIA NACIONAL DE TRANSPORTES AQUAVIÁRIOS – ANTAQ");
		hm.put(54793, "AGÊNCIA NACIONAL DE TRANSPORTES TERRESTRES – ANTT");
		hm.put(36687, "AGÊNCIA NACIONAL DE VIGILÂNCIA SANITÁRIA – ANVISA");
		hm.put(57682, "AGÊNCIA NACIONAL DO CINEMA – ANCINE");
		hm.put(25281, "AGÊNCIA NACIONAL DO PETRÓLEO, GÁS NATURAL E BIOCOMBUSTÍVEIS – ANP");
		hm.put(334, "ARQUIVO NACIONAL – AN");
		hm.put(89, "BANCO CENTRAL DO BRASIL – BCB");
		hm.put(57952, "CENTRO DE TECNOLOGIA DA INFORMAÇÃO RENATO ARCHER – CTI");
		//hm.put(, "CENTRO DE TECNOLOGIA MINERAL – CTM");
		hm.put(448, "CENTRO FEDERAL DE EDUCAÇÃO TECNOLÓGICA ´CELSO SUCKOW  DA FONSECA´  - CEFET- RJ");
		hm.put(445, "CENTRO FEDERAL DE EDUCAÇÃO TECNOLÓGICA DE MINAS GERAIS – CEFET – MG");
		hm.put(256, "COLÉGIO PEDRO II – CP II");
		hm.put(48, "COMANDO DA AERONÁUTICA – COMAER");
		hm.put(185, "COMANDO DA MARINHA – CMAR");
		hm.put(94, "COMANDO DA MARINHA – CMAR");
		hm.put(478, "COMISSÃO DE VALORES MOBILIÁRIOS – CVM");
		hm.put(223, "COMISSÃO NACIONAL DE ENERGIA NUCLEAR – CNEN");
		hm.put(322, "CONSELHO ADMINISTRATIVO DE DEFESA ECONÔMICA – CADE");
		hm.put(8, "CONSELHO NACIONAL DE DESENVOLVIMENTO CIENTÍFICO E TECNOLÓGICO – CNPQ");
		hm.put(3620, "CONTROLADORIA GERAL DA UNIÃO – CGU");
		hm.put(250, "COORDENAÇÃO DE APERFEIÇOAMENTO DE PESSOAL DE NÍVEL SUPERIOR – CAPES");
		hm.put(324, "DEPARTAMENTO DE POLÍCIA FEDERAL - DPF");
		hm.put(704, "DEPARTAMENTO DE POLÍCIA RODOVIÁRIA FEDERAL - DPRF");
		hm.put(54844, "DEPARTAMENTO NACIONAL DE INFRAESTRUTURA DE TRANSPORTES – DNIT");
		hm.put(367, "DEPARTAMENTO NACIONAL DE OBRAS CONTRA AS SECAS – DNOCS");
		hm.put(1918, "DEPARTAMENTO NACIONAL DE PRODUÇÃO MINERAL – DNPM");
		hm.put(86567, "EMPRESA BRASIL DE COMUNICAÇÃO – EBC");
		hm.put(119672, "EMPRESA DE PLANEJAMENTO E LOGÍSTICA - EPL");
		hm.put(1013, "EMPRESA GERENCIAL DE PROJETOS NAVAIS – EMGEPRON");
		hm.put(344, "ESCOLA DE ADMINISTRAÇÃO FAZENDÁRIA – ESAF");
		hm.put(299, "FUNDAÇÃO ALEXANDRE DE GUSMÃO – FUNAG");
		hm.put(984, "FUNDAÇÃO BIBLIOTECA NACIONAL – BN");
		hm.put(261, "FUNDAÇÃO CASA DE RUI BARBOSA – FCRB");
		hm.put(1782, "FUNDAÇÃO CULTURAL PALMARES – FCP");
		hm.put(956, "FUNDAÇÃO ESCOLA NACIONAL DE ADMINISTRAÇÃO PÚBLICA - ENAP");
		hm.put(3, "FUNDAÇÃO INSTITUTO BRASILEIRO DE GEOGRAFIA E ESTÁTISTICA – IBGE");
		hm.put(7, "FUNDAÇÃO INSTITUTO DE PESQUISA ECONÔMICA APLICADA - IPEA");
		hm.put(257, "FUNDAÇÃO JOAQUIM NABUCO – FUNDAJ");
		hm.put(221, "FUNDAÇÃO JORGE DUPRAT FIGUEIREDO, DE SEGURANÇA E MEDICINA DO TRABALHO – FUNDACENTRO");
		hm.put(2330, "FUNDAÇÃO NACIONAL DE ARTES – FUNARTE");
		hm.put(2207, "FUNDAÇÃO NACIONAL DE SAÚDE – FUNASA");
		hm.put(173, "FUNDAÇÃO NACIONAL DO ÍNDIO – FUNAI");
		hm.put(315, "FUNDAÇÃO OSWALDO CRUZ – FIOCRUZ");
		hm.put(470, "FUNDAÇÃO UNIVERSIDADE DE BRASÍLIA – UNB");
		hm.put(465, "FUNDAÇÃO UNIVERSIDADE DO AMAZONAS – UFAM");
		hm.put(84712, "FUNDAÇÃO UNIVERSIDADE FEDERAL DA GRANDE DOURADOS – UFGD");
		hm.put(970, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE CIÊNCIAS DA SAÚDE DE PORTO ALEGRE – UFCSPA");
		hm.put(471, "FUNDAÇÃO UNIVERSIDADE DE MATO GROSSO – UFMT");
		hm.put(827, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO MATO GROSSO DO SUL – UFMS");
		hm.put(477, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE PELOTAS – UFPEL");
		hm.put(1209, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE RONDÔNIA – UNIR");
		hm.put(1605, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE RORAIMA – UFRR");
		hm.put(475, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE SÃO CARLOS – UFSCAR");
		hm.put(1734, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE SÃO JOÃO DEL REI – FUNREI");
		hm.put(469, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE SERGIPE – UFS");
		hm.put(474, "FUNDAÇÃO UNIVERSIDADE DE VIÇOSA – UFV");
		hm.put(84703, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO ABC – UFABC");
		hm.put(466, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO ACRE – UFAC");
		hm.put(1710, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO AMAPÁ – UNIFAP");
		hm.put(467, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO MARANHÃO – UFMA");
		hm.put(94739, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO PAMPA – UNIPAMPA");
		hm.put(468, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO PIAUÍ – UFPI");
		hm.put(476, "FUNDAÇÃO UNIVERSIDADE DO RIO GRANDE – FURG");
		hm.put(52702, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO TOCANTINS – UFT");
		hm.put(69624, "FUNDAÇÃO UNIVERSIDADE FEDERAL DO VALE DO SÃO FRANCISCO – UNIVASF");
		hm.put(253, "FUNDO NACIONAL DE DESENVOLVIMENTO DA EDUCAÇÃO - FNDE");
		hm.put(35, "HOSPITAL DAS FORÇAS ARMADAS – HFA");
		hm.put(332, "IMPRENSA NACIONAL – IN");
		hm.put(12, "INSTITUTO BRASILEIRO DE INFORMAÇÃO EM CIÊNCIA E TECNOLOGIA – IBICT");
		hm.put(100584, "INSTITUTO BRASILEIRO DE MUSEUS – IBRAM");
		hm.put(241, "INSTITUTO BRASILEIRO DE TURISMO - EMBRATUR");
		hm.put(1812, "INSTITUTO BRASILEIRO DO MEIO AMBIENTE E DOS RECURSOS NATURAIS RENOVÁVEIS - IBAMA");
		hm.put(91842, "INSTITUTO CHICO MENDES DE CONSERVAÇÃO DA BIODIVERSIDADE - ICMBIO");
		hm.put(1913, "INSTITUTO DE PESQUISAS JARDIM BOTÂNICO DO RIO DE JANEIRO – JBRJ");
		hm.put(2045, "INSTITUTO DO PATRIMÔNIO HISTÓRICO E ARTÍSTICO NACIONAL - IPHAN");
		hm.put(456, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA  SUL-RIO-GRANDENSE");
		hm.put(100920, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA BAIANO – IFBAIANO");
		hm.put(100919, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA CATARINENSE – IFC");
		hm.put(444, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DA BAHIA – IFBA");
		hm.put(100905, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DA PARAÍBA – IFPB");
		hm.put(100900, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE ALAGOAS – IFAL");
		hm.put(94430, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE BRASÍLIA – IFB");
		hm.put(451, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE GOIÁS – IFGO");
		hm.put(100914, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MINAS GERAIS – IFMG");
		hm.put(100922, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE PERNAMBUCO – IFPE");
		hm.put(100907, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE RONDÔNIA – IFRO");
		hm.put(3561, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE RORAIMA – IFRR");
		hm.put(455, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE SANTA CATARINA – IFSC");
		hm.put(453, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE SÃO PAULO – IFSP");
		hm.put(100909, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE SERGIPE – IFS");
		hm.put(94427, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO ACRE – IFAC");
		hm.put(94428, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO AMAPÁ – IFAP");
		hm.put(100910, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO AMAZONAS – IFAM");
		hm.put(100911, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO CEARÁ – IFCE");
		hm.put(100912, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO ESPÍRITO SANTO – IFES");
		hm.put(100921, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO MARANHÃO – IFMA");
		hm.put(100916, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DE MATO GROSSO  - IFMT");
		hm.put(100904, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO MATO GROSSO DO SUL – IFMS");
		hm.put(100901, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO NORTE DE MINAS GERAIS – IFNMG");
		hm.put(100917, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARÁ – IFPA");
		hm.put(49103, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PARANÁ – IFPR");
		hm.put(434, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO PIAUÍ – IFPI");
		hm.put(100930, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO RIO DE JANEIRO – IFRJ");
		hm.put(439, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO RIO GRANDE DO NORTE – IFRN");
		hm.put(100918, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO RIO GRANDE DO SUL – IFRS");
		hm.put(46784, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SERTÃO PERNAMBUCANO – IFSERTAO-PE");
		hm.put(100902, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUDESTE DE MINAS GERAIS – IFMGSE");
		hm.put(100915, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO SUL DE MINAS GERAIS – IFSULDEMINAS");
		hm.put(100908, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DOTOCANTINS – IFTO");
		hm.put(100903, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA DO TRIÂNGULO MINEIRO -  IFTM");
		hm.put(100906, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA FARROUPILHA – IFFARROUPILHA");
		hm.put(100931, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA FLUMINENSE – IFFLUMINENSE");
		hm.put(100913, "INSTITUTO FEDERAL DE EDUCAÇÃO, CIÊNCIA E TECNOLOGIA GOIANO – IFGOIANO");
		hm.put(382, "INSTITUTO NACIONAL DA PROPRIEDADE INDUSTRIAL – INPI");
		hm.put(2409, "INSTITUTO NACIONAL DE CÂNCER JOSÉ ALENCAR GOMES DA SILVA - INCA");
		hm.put(14769, "INSTITUTO NACIONAL DE CARDIOLOGIA – INC/SAS");
		hm.put(1799, "INSTITUTO NACIONAL DE COLONIZAÇÃO E REFORMA AGRÁRIA - INCRA");
		hm.put(249, "INSTITUTO NACIONAL DE ESTUDOS E PESQUISAS EDUCACIONAIS ANÍSIO TEIXEIRA - INEP");
		hm.put(2030, "INSTITUTO NACIONAL DE METEOROLOGIA - INMET");
		hm.put(240, "INSTITUTO NACIONAL DE METROLOGIA, QUALIDADE E TECNOLOGIA - INMETRO");
		hm.put(10, "INSTITUTO NACIONAL DE PESQUISAS ESPACIAIS – INPE");
		hm.put(11, "INSTITUTO NACIONAL DE PESQUISAS DA AMAZÔNIA - INPA");
		hm.put(232, "INSTITUTO NACIONAL DE TECNOLOGIA – INT");
		hm.put(47388, "INSTITUTO NACIONAL DE TECNOLOGIA DA INFORMAÇÃO – ITI");
		hm.put(1934, "INSTITUTO NACIONAL DO SEGURO SOCIAL – INSS");
		hm.put(982, "LABORATÓRIO NACIONAL DE COMPUTAÇÃO CIENTÍFICA – LNCC");
		hm.put(14, "MINISTÉRIO DA AGRICULTURA, PECUÁRIA E ABASTECIMENTO – MAPA");
		hm.put(1988, "MINISTÉRIO DA CIÊNCIA, TECNOLOGIA E INOVAÇÃO – MCTI");
		hm.put(1926, "MINISTÉRIO DA CULTURA – MINC");
		hm.put(41066, "MINISTÉRIO DA DEFESA – MD");
		hm.put(244, "MINISTÉRIO DA EDUCAÇÃO – MEC");
		hm.put(1929, "MINISTÉRIO DA FAZENDA – MF");
		hm.put(42670, "MINISTÉRIO DA INTEGRAÇÃO NACIONAL – MI");
		hm.put(316, "MINISTÉRIO DA JUSTIÇA – MJ");
		hm.put(304, "MINISTÉRIO DA SAÚDE – MS");
		hm.put(42672, "MINISTÉRIO DAS CIDADES – MCIDADES");
		hm.put(3159, "MINISTÉRIO DAS COMUNICAÇÕES – MC");
		hm.put(3495, "MINISTÉRIO DAS MULHERES, DA IGUALDADE RACIAL, DA JUVENTUDE E DOS DIREITOS HUMANO – MMIRDH");
		hm.put(263, "MINISTÉRIO DAS RELAÇÕES EXTERIORES – MRE");
		hm.put(2852, "MINISTÉRIO DE MINAS E ENERGIA – MME");
		hm.put(17125, "MINISTÉRIO DO DESENVOLVIMENTO AGRÁRIO – MDA");
		hm.put(1945, "MINISTÉRIO DO DESENVOLVIMENTO SOCIAL E COMBATE À FOME – MDS");
		hm.put(3162, "MINISTÉRIO DO DESENVOLVIMENTO, INDÚSTRIA E COMÉRCIO EXTERIOR – MDIC");
		hm.put(36670, "MINISTÉRIO DO ESPORTE – ME");
		hm.put(1927, "MINISTÉRIO DO MEIO AMBIENTE – MMA");
		hm.put(2981, "MINISTÉRIO DO PLANEJAMENTO, ORÇAMENTO E GESTÃO – MPOG");
		hm.put(2844, "MINISTÉRIO DO TRABALHO E PREVIDÊNCIA SOCIAL – MTPS");
		hm.put(72084, "MINISTÉRIO DO TURISMO – MTUR");
		hm.put(2846, "MINISTÉRIO DOS TRANSPORTES – MT");
		hm.put(24755, "MUSEU DE ASTRONOMIA E CIÊNCIAS AFINS – MAST");
		hm.put(24712, "MUSEU PARAENSE EMÍLIO GOELDI – MPEG");
		hm.put(346, "OBSERVATÓRIO NACIONAL – ON");
		hm.put(78, "PROCURADORIA-GERAL DA FAZENDA NACIONAL – PGFN");
		hm.put(115257, "SECRETARIA DA RECEITA FEDERAL DO BRASIL – RFB");
		hm.put(1801, "SECRETARIA DE AVIAÇÃO CIVIL – SAC");
		hm.put(119335, "SECRETARIA DE TECNOLOGIA DA INFORMAÇÃO – STI");
		hm.put(92748, "SECRETARIA NACIONAL DO CONSUMIDOR – SENACON");
		hm.put(92748, "SECRETARIA DE ORÇAMENTO FEDERAL – SOF");
		hm.put(1986, "SECRETARIA DE PORTOS – SEP");
		hm.put(1696, "SECRETARIA DE PORTOS – SEP");
		hm.put(42673, "SECRETARIA DO PATRIMÔNIO DA UNIÃO – SPU");
		hm.put(89539, "SECRETARIA DO TESOURO NACIONAL – STN");
		hm.put(166, "SECRETARIA DE GOVERNO DA PRESIDÊNCIA DA REPÚBLICA – SEGOV");
		hm.put(235, "SERVIÇO FLORESTAL BRASILEIRO – SFB");
		hm.put(91138, "SUPERINTENDÊNCIA DA ZONA FRANCA DE MANAUS – SUFRAMA");
		hm.put(100113, "SUPERINTENDÊNCIA DE SEGUROS PRIVADOS – SUSEP");
		hm.put(91144, "SUPERINTENDÊNCIA DO DESENVOLVIMENTO DA AMAZÔNIA – SUDAM");
		hm.put(105915, "SUPERINTENDÊNCIA DO DESENVOLVIMENTO DO CENTRO-OESTE – SUDECO");
		hm.put(109912, "SUPERINTENDÊNCIA DO DESENVOLVIMENTO DO NORDESTE – SUDENE");
		hm.put(421, "SUPERINTENDÊNCIA NACIONAL DE PREVIDÊNCIA COMPLEMENTAR – PREVIC");
		hm.put(103730, "UNIVERSIDADE DA INTEGRAÇÃO INTERNACIONAL DA LUSOFONIA AFRO-BRASILEIRA – UNILAB");
		hm.put(105793, "UNIVERSIDADE FEDERAL DA BAHIA – UFBA");
		hm.put(419, "UNIVERSIDADE FEDERAL DA FRONTEIRA SUL – UFFS");
		hm.put(420, "UNIVERSIDADE FEDERAL DA INTEGRAÇÃO LATINO-AMERICANA – UNILA");
		hm.put(461, "UNIVERSIDADE FEDERAL DA PARAÍBA – UFPB");
		hm.put(67671, "UNIVERSIDADE FEDERAL DE ALAGOAS – UFAL");
		hm.put(422, "UNIVERSIDADE FEDERAL DE ALFENAS – UNIFAL-MG");
		hm.put(462, "UNIVERSIDADE FEDERAL DE CAMPINA GRANDE – UFCG");
		hm.put(424, "UNIVERSIDADE FEDERAL DE GOIÁS – UFG");
		hm.put(463, "UNIVERSIDADE FEDERAL DE ITAJUBÁ – UNIFEI");
		hm.put(423, "UNIVERSIDADE FEDERAL DE JUIZ DE FORA – UFJF");
		hm.put(473, "UNIVERSIDADE FEDERAL DE LAVRAS -  UFLA");
		hm.put(418, "UNIVERSIDADE FEDERAL DE MINAS GERAIS – UFMG");
		hm.put(429, "FUNDAÇÃO UNIVERSIDADE FEDERAL DE OURO PRETO – UFOP");
		hm.put(431, "UNIVERSIDADE FEDERAL DE PERNAMBUCO – UFPE");
		hm.put(464, "UNIVERSIDADE FEDERAL DE SANTA CATARINA – UFSC");
		hm.put(472, "UNIVERSIDADE FEDERAL DE SANTA MARIA – UFSM");
		hm.put(122391, "UNIVERSIDADE FEDERAL DE SÃO PAULO – UNIFESP");
		hm.put(416, "UNIVERSIDADE FEDERAL DE UBERLÂNDIA – UFU");
		hm.put(425, "UNIVERSIDADE FEDERAL DO CARIRI - UFCA");
		hm.put(260, "UNIVERSIDADE FEDERAL DO CEARÁ – UFC");
		hm.put(104667, "UNIVERSIDADE FEDERAL DO ESPÍRITO SANTO – UFES");
		hm.put(415, "UNIVERSIDADE FEDERAL DO ESTADO DO RIO DE JANEIRO – UNIRIO");
		hm.put(122386, "UNIVERSIDADE FEDERAL DO OESTE DA BAHIA – UFOB");
		hm.put(428, "UNIVERSIDADE FEDERAL DO OESTE DO PARÁ – UFOPA");
		hm.put(84710, "UNIVERSIDADE FEDERAL DO PARÁ – UFPA");
		hm.put(426, "UNIVERSIDADE FEDERAL DO PARANÁ – UFPR");
		hm.put(417, "UNIVERSIDADE FEDERAL DO RECÔNCAVO DA BAHIA – UFRB");
		hm.put(430, "UNIVERSIDADE FEDERAL DO RIO DE JANEIRO -  UFRJ");
		hm.put(122381, "UNIVERSIDADE FEDERAL DO RIO GRANDE DO NORTE -  UFRN");
		hm.put(459, "UNIVERSIDADE FEDERAL DO RIO GRANDE DO SUL -  UFRGS");
		hm.put(122378, "UNIVERSIDADE FEDERAL DO SUL DA BAHIA – UFESBA");
		hm.put(460, "UNIVERSIDADE FEDERAL DO SUL E SUDESTE DO PARÁ – UNIFESSPA");
		hm.put(427, "UNIVERSIDADE FEDERAL DO TRIÂNGULO MINEIRO – UFTM");
		hm.put(457, "UNIVERSIDADE FEDERAL DOS VALES DO JEQUITINHONHA E MUCURI – UFVJM");
		hm.put(433, "UNIVERSIDADE FEDERAL FLUMINENSE – UFF");
		hm.put(432, "UNIVERSIDADE FEDERAL RURAL DA AMAZÔNIA – UFRA");
		hm.put(458, "UNIVERSIDADE FEDERAL RURAL DE PERNAMBUCO – UFRPE");
		hm.put(454, "UNIVERSIDADE FEDERAL RURAL DO RIO DE JANEIRO – UFRRJ");
		hm.put(1800, "UNIVERSIDADE FEDERAL RURAL DO SEMI-ÁRIDO – UFERSA-RN");
		hm.put(27, "UNIVERSIDADE TECNOLÓGICA FEDERAL DO PARANÁ – UTFPR");
		hm.put(37003, "VALEC - ENGENHARIA, CONSTRUÇÕES E FERROVIAS S.A");

	}

	public boolean validaFinalidade(String str){
		return str != null && str.length() > 0;
	}
	
	public boolean containsCaseInsensitive(String strToCompare, List<String> list)
	{
	    for(String str:list)
	    {
	        if(str.equalsIgnoreCase(strToCompare))
	        {
	            return(true);
	        }
	    }
	    return(false);
	}
	
	public String retornaSIORG (String orgao){
		for (Entry<Integer, String> entry : hm.entrySet()) {
            if (entry.getValue().equals(orgao.toUpperCase())) {
                return entry.getKey().toString();
            }
        }
		return "";
	}
	
	private void campoObrigatorioPreenchido(String str, String campo){
		if (str== null || str.trim().length() == 0){
			throw new RuntimeException("Campo \"" + campo + "\" é obritório. Favor preencher!" );
		}
		//return str!= null && str.trim().length() > 0;
	}
}
