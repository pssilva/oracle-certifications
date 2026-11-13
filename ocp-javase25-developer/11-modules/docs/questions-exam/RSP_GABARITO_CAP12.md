QCAP12_01: E. Módulos precisam ter um arquivo `module-info.java` no diretório raiz do módulo. A opção E atende a esse requisito.

QCAP12_02: B. As opções A, C e E estão incorretas porque se referem a diretivas que não existem. A diretiva `exports` é usada para permitir que um pacote seja acessado por código fora do módulo, tornando a opção B a resposta correta. Observe que as opções D e F estão incorretas porque `requires` é a palavra-chave inadequada para esse contexto.

QCAP12_03: G. A opção `-p` ou `--module-path` é usada para especificar a localização dos módulos. A opção `-m` ou `--module` é usada para especificar o módulo e o nome da classe. No entanto, ao executar um programa, o nome do pacote deve ser especificado usando pontos (.) em vez de barras (/). Como o comando está incorreto, a opção G é a correta.

QCAP12_04: D. Um serviço consiste em uma interface de provedor de serviço (service provider interface) e na lógica para localizar implementações por meio de um localizador de serviços (service locator). Isso torna a opção D correta. Lembre-se de que o próprio provedor de serviço é a implementação, a qual não é considerada parte do serviço em si.

QCAP12_05: E, F. Módulos automáticos estão no *module path*, mas não possuem um arquivo `module-info.java`. Módulos nomeados (*named modules*) estão no *module path* e possuem um arquivo `module-info.java`. Módulos não nomeados (*unnamed modules*) estão no *classpath*. Portanto, as opções E e F estão corretas.

QCAP12_06: A, F. As opções C e D estão incorretas porque não existe uma diretiva `use`. As opções A e F estão corretas, pois `opens` é utilizado para *reflection*, e `uses` declara que uma API consome um serviço.

QCAP12_07: A, B, E. Qualquer informação de versão ao final do nome de um arquivo JAR é removida, tornando as opções A e B corretas. Sublinhados (_) são convertidos em pontos (.), o que torna as opções C e D incorretas. Outros caracteres especiais, como o cifrão ($), também são convertidos em pontos. Além disso, pontos adjacentes são mesclados, e pontos no início ou no fim do nome são removidos. Portanto, a opção E também está correta.

QCAP12_08: A, D. Uma dependência cíclica ocorre quando um grafo de módulos forma um círculo. A opção A está correta porque o *Java Platform Module System* não permite dependências cíclicas entre módulos. Não existe tal restrição para pacotes, o que torna a opção B incorreta. Uma dependência cíclica pode envolver dois ou mais módulos que dependem um do outro, tornando a opção D correta, enquanto a opção C está incorreta. Por fim, a opção E está incorreta porque módulos sem nome não podem ser referenciados a partir de um módulo automático.

QCAP12_09: F. A diretiva `provides` recebe primeiro o nome da interface e, em seguida, o nome da classe que a implementa, utilizando também a palavra-chave `with`. Apenas a opção F atende a esses dois critérios, sendo, portanto, a resposta correta.

QCAP12_10: B, C. Pacotes dentro de um módulo não são exportados por padrão, o que torna a opção B correta e a opção A incorreta. A exportação é necessária para que outros códigos possam utilizar os pacotes; ela não é necessária para chamar o método `main()` via linha de comando, o que torna a opção C correta e a opção D incorreta. O arquivo `module-info.java` possui o nome correto e é compilável, tornando as opções E e F incorretas.

QCAP12_11: D, G, H. As opções A, B, E e F estão incorretas porque fazem referência a diretivas que não existem. A diretiva `requires transitive` é utilizada ao especificar um módulo que deve ser usado pelo módulo solicitante e por quaisquer outros módulos que utilizem esse módulo solicitante. Portanto, o módulo `dog` precisa especificar a relação transitiva, tornando a opção G correta. O módulo `puppy` precisa apenas de um `requires dog` para obter as dependências transitivas, o que torna a opção D correta. Contudo, como `requires transitive` engloba todas as funcionalidades de `requires` — e adiciona outras —, a opção H também é uma resposta correta.

QCAP12_12: A, B, C, F. A opção D está incorreta porque se refere a um nome de pacote, e não a um nome de módulo. A opção E está incorreta porque o nome do módulo é `java.base`, e não `jdk.base`. A opção G está incorreta porque foi inventada. As opções A, B, C e F estão corretas.

QCAP12_13: D. Não existe um método `getStream()` na classe `ServiceLoader`, o que torna as opções A e C incorretas. A opção B não compila, pois o método `stream()` retorna uma lista de interfaces `Provider` e precisa ser convertido para a interface `Unicorn` que nos interessa. Portanto, a opção D está correta.

QCAP12_14: C. A opção `-p` é uma forma abreviada de `--module-path`. Como a mesma opção não pode ser especificada duas vezes, as opções B, D e F estão incorretas. O nome do módulo e o nome da classe são separados por uma barra, o que torna a opção C a resposta correta. Observe que "x-x" é válido, pois o caminho do módulo (module path) corresponde ao nome de uma pasta; portanto, o uso de hifens é permitido.

QCAP12_15: B. Uma estratégia de migração *top-down* (de cima para baixo) começa colocando todos os arquivos JAR no *module path*. Em seguida, migra o módulo de nível superior para que ele se torne um módulo nomeado, mantendo os demais módulos como módulos automáticos. A opção B está correta, pois contempla ambas as características.

QCAP12_16: A. Como se trata de um novo módulo, é necessário compilá-lo. No entanto, nenhum dos módulos existentes precisa ser recompilado, o que torna a opção A correta. O *service locator* (localizador de serviços) reconhecerá o novo provedor de serviços simplesmente pelo fato de ele estar presente no *module path*.

QCAP12_17: E. Pergunta capciosa! Um módulo sem nome (*unnamed module*) não utiliza um arquivo `module-info.java`. Portanto, a opção E está correta. Um módulo sem nome pode acessar um módulo automático (*automatic module*). O módulo sem nome tratará o módulo automático simplesmente como um arquivo JAR comum, sem envolver o arquivo `module-info.java`.

QCAP12_18: F. O comando `jpackage` cria uma aplicação autossuficiente, como um arquivo `.exe`. O comando `jlink` cria um diretório com um *runtime* Java reduzido, contendo apenas o necessário. O comando `jimage` é utilizado para inspecionar um arquivo de imagem Java. Portanto, a opção F está correta.

QCAP12_19: E. Há uma pegadinha aqui. A definição de um módulo utiliza a palavra-chave `module`, e não `class`. Como o código não compila, a opção E está correta. Se o código compilasse, as opções A e D estariam corretas.

QCAP12_20: A. Ao executar o comando `java` com a opção `-d`, todos os módulos necessários são listados. Além disso, o módulo `java.base` também aparece, pois é incluído automaticamente. A linha termina com `mandated`, o que torna a opção A correta. A menção a `java.lang` é uma pegadinha, já que se trata de um pacote importado por padrão em uma classe, e não em um módulo.

QCAP12_21: H. Esta questão é complexa. O localizador de serviços (*service locator*) deve conter uma diretiva `uses`, mas isso se aplica à interface do provedor de serviços (*service provider interface*). Nenhum módulo precisa especificar `requires` para o provedor de serviços, uma vez que este representa a implementação. Como nenhuma das outras opções está correta, a opção H é a resposta.

QCAP12_22: A, F. Um módulo automático exporta todos os seus pacotes, tornando a opção A correta. Um módulo sem nome não fica disponível para outros módulos presentes no *module path*; portanto, ele não exporta nenhum pacote, o que torna a opção F correta.

QCAP12_23: E. O nome do módulo é válido, assim como as declarações `exports`. As linhas 4 e 5 são capciosas, pois, individualmente, cada uma é válida. No entanto, não é permitido utilizar o mesmo nome de módulo em duas declarações `requires`. A segunda declaração causa uma falha de compilação na linha 5, tornando a opção E a resposta correta.

QCAP12_24: A. Como o arquivo JAR está no *classpath*, ele é tratado como um módulo sem nome comum, mesmo que contenha um arquivo `module-info.java` em seu interior. Lembre-se, a partir do estudo sobre a migração *top-down*, que módulos no *module path* não podem fazer referência ao *classpath*; portanto, as opções B e D estão incorretas. O *classpath* não possui um mecanismo para restringir pacotes, o que torna a opção A correta e as opções C e E incorretas.

QCAP12_25: A, C, D. As opções A e C estão corretas porque tanto o consumidor quanto o *service locator* (localizador de serviços) dependem da *service provider interface* (interface do provedor de serviço). Além disso, a opção D está correta porque o *service locator* deve especificar que utiliza a *service provider interface* para realizar a busca.