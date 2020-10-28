public class DisciplinaTrimestral extends Disciplina{

  public void avaliarDisciplina(){
double x=0;

x=(this.nota1 * 0.4)+(this.nota2 * 0.6);

System.out.println("O valor de x é"+x);
  }
}