public class Pole {
    public char[][] pole;
    public char wall;
    public int widht;
    public int height;
    public  Pole(int widht,int height){
        this.widht=widht;
        this.height=height;
        if (this.widht>0&&this.height>0){
            this.pole=new char[this.widht][this.height];
        }
        this.wall='*';
    }

    public void CreatePole(){
        for (int i=0;i<this.widht;i++){
            for (int j=0;j<this.height;j++){
                if (i==0||i==this.height-1||j==0||j==this.widht-1)
                {
                    this.pole[i][j]=this.wall;
                }
                else {
                    this.pole[i][j]=' ';
                }
            }
        }
    }
    public void PrintPole(){
        for (int i=0;i<this.widht;i++){
            for (int j=0;j<this.height;j++){
                System.out.print(this.pole[i][j]+" ");
            }
            System.out.println();
        }
    }



}
