# Bertoti
Engenharia de Software

1 - What precisely do we mean by software engineering? What distinguishes “software engineering” from “programming” or “computer science”? And why would Google have a unique perspective to add to the corpus of previous software engineering literature written over the past 50 years?
 
The terms “programming” and “software engineering” have been used interchangeably for quite some time in our industry, although each term has a different emphasis and different implications. University students tend to study computer science and get jobs writing code as “programmers.”
 
“Software engineering,” however, sounds more serious, as if it implies the application of some theoretical knowledge to build something real and precise. Mechanical engineers, civil engineers, aeronautical engineers, and those in other engineering disciplines all practice engineering. They all work in the real world and use the application of their theoretical knowledge to create something real. Software engineers also create “something real,” though it is less tangible than the things other engineers create.
 
Unlike those more established engineering professions, current software engineering theory or practice is not nearly as rigorous. Aeronautical engineers must follow rigid guidelines and practices, because errors in their calculations can cause real damage; programming, on the whole, has traditionally not followed such rigorous practices. But, as software becomes more integrated into our lives, we must adopt and rely on more rigorous engineering methods. We hope this book helps others see a path toward more reliable software practices.

#Resumo: Engenharia de software necessita de um amplo conhecimeto teórico para criar algo real, diferentemente da programação. Um engenheiro de software não tem regras tão rígidas em relação a outros tipos de engenheiros de outras áreas, pois um erro acaba sendo não tão consequente em relação as outras áreas. Porém, é necessário criar regras mais rígidas com a crescente presença da tecnologia nas vidas das pessoas.

2 - Programming Over Time
We propose that “software engineering” encompasses not just the act of writing code, but all of the tools and processes an organization uses to build and maintain that code over time. What practices can a software organization introduce that will best keep its code valuable over the long term? How can engineers make a codebase more sustainable and the software engineering discipline itself more rigorous? We don’t have fundamental answers to these questions, but we hope that Google’s collective experience over the past two decades illuminates possible paths toward finding those answers.
 
One key insight we share in this book is that software engineering can be thought of as “programming integrated over time.” What practices can we introduce to our code to make it sustainable—able to react to necessary change—over its life cycle, from conception to introduction to maintenance to deprecation?
 
The book emphasizes three fundamental principles that we feel software organizations should keep in mind when designing, architecting, and writing their code:
 
Time and Change
How code will need to adapt over the length of its life
 
Scale and Growth
How an organization will need to adapt as it evolves
 
Trade-offs and Costs
How an organization makes decisions, based on the lessons of Time and Change and Scale and Growth

#Resumo: Um engenheiro de software não apenas programa, mas mantém o código em funcionamento ao longo de sua vida útil e é responsavel por dedicar estratégias que prolonguem e solidifiquem a vida útil do código.


#Tipos de Trade-off: 
- Dados compactados e Dados descompactados: Dados compactados reduz o uso de memória,porém é necessário sempre descompacta-los. Dados descompactados aumenta o uso de memória,mas é mais prático.
- Tabelas de Busca e re-calculção:  Uma implementação pode incluir uma tabela inteira, que reduz o tempo computacional, mas aumenta a quantidade de memória necessária, ou pode-se computar partes das tabelas, aumentando o tempo, mas reduzindo o custo em memória.
- Re-renderização e imagens armazenadas:  Solução entre renderizar uma imagem sempre que entrar em uma página gastando mais tempo para carrega-la ou armazenar a imagem na primeira vez que renderizar a página gastando mais memória.


#Comentario slide 57:
- Um clássico exemplo de pensamento ágil e iterativo no desenvolvimento de sistemas é que não adianta construir partes isoladas (como rodas soltas ou um chassi incompleto) se essas partes, por si só, não entregam nenhum valor ao usuário. A grande sacada é: entregar algo funcional desde o início, mesmo que simples. Assim você testa, aprende, ajusta, e evolui com feedback real, e o usuário já começa a se beneficiar cedo do sistema.
