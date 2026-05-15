package br.com.oracle_certificatons.ocp.javase_17_developer_1z0_829;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AlgoritmoMetodologiaParaleloConcorrenteTest {

	//@Autowired
  AlgoritmoMetodologiaParaleloConcorrente algoritmoMetodologiaParaleloConcorrente;

  @BeforeEach
  void setup(){
    this.algoritmoMetodologiaParaleloConcorrente = new AlgoritmoMetodologiaParaleloConcorrente();
  }

  @Test
  void qualquerTest(){
    
    this.algoritmoMetodologiaParaleloConcorrente.qualquerAogritmo();
  }

  @Test
	@DisplayName("Teste :: {{NOME_METODO}}()")
  void testSequecialAogritmoQualquer() {
    this.algoritmoMetodologiaParaleloConcorrente.sequecialAogritmoQualquer();
  }


}
