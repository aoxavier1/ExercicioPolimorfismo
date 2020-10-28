public class DisciplinaAnual extends Disciplina{

   double nota3;
  double nota4;
   double nota5;
   double nota6;


public double getnota1(){
  return this.nota1;
}

public double getnota2(){
  return this.nota2;
}

public void setnota1(double nota1){
  this.nota1=nota1;
}

public void setnota2(double nota2){
  this.nota2=nota2;
}

public double getnota3(){
  return this.nota3;
}

public void setnota3(double nota3){
  this.nota3=nota3;
}

public double getnota4(){
  return this.nota4;
}

public void setnota4(double nota4){
  this.nota4=nota4;
}

public double getnota5(){
  return this.nota5;
}

public void setnota5(double nota5){
  this.nota5=nota5;
}

public double getnota6(){
  return this.nota6;
}

public void setnota6(double nota6){
  this.nota6=nota6;
}

  public void avaliarDisciplina(){
double x2=0;

x2=((this.nota1+this.nota2+this.nota3+this.nota4+this.nota5)/5 * 0.6)+(this.nota6 * 0.4);

System.out.println("O valor de x1 é"+x2);
  }
}