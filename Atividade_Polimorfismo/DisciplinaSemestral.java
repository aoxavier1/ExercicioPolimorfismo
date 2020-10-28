public class DisciplinaSemestral extends Disciplina{

   double nota3;

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

  public void avaliarDisciplina(){
double x1=0;

x1=(this.nota1+this.nota2+this.nota3)/3;

System.out.println("O valor de x1 é"+x1);
  }
}