package Lektion14.Ubung4;

public class Strecke {
    int a;
    int b;

    Strecke(int a , int b){
        if(a>0&&b>0){
            if(a>b) {
                this.b=a;
                this.a=b;
            }else {
                this.a = a;
                this.b = b;
            }
        }else throw new IllegalArgumentException();
    }
    public boolean überschneiden(Strecke zweite){
        if(this.b>zweite.a && zweite.b>this.a) return true;
        else return false;
    }

    @Override
    public String toString() {
        String result;
        if(b==a){
             result=Integer.toString(a);

        }else {
             result = Integer.toString(a);
            for (int i = 0; i < b - a; i++) {
                result += '-';
            }
            result += Integer.toString(b);
        }
        return result;
    }

}
