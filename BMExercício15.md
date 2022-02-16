15.A classe abaixo pode ser compilada sem erros. Quando for executado, o 
programa imprimirá o resultado da comparação na linha 11, que é true, 
mas o resultado da comparação na linha 12 é false. Explique por que.
1 class DemoDataCopiada
2 {
3 public static void main(String[] argumentos)
4 {
5 Data aniversariodaMaria = new Data();
6 Data meuaniversario= new Data();
7 Data corpuschristi2010;
8 meuaniversario.inicializaData(3,6,2010);
9 aniversariodaMaria.inicializaData (3,6,2010);
10 corpuschristi2010= meuaniversario;
11 System.out.println(corpuschristi2010 == meuaniversario);
12 System.out.println(corpuschristi2010 == aniversariodaMaria);
13 }
14 

**R:** O resultado da linha 12 é false, pois, na verdade, não é o conteúdo de corpuschristi2010 e aniversariodaMaria que está sendo comparado, mas, o valor da referência de memória dos objetos. Na linha 11 o valor é true, pois corpuschristi2010 aponta para o mesmo espaço na memória em que o meuaniversario foi alocado.