public class Match {

    Figther figther1;
    Figther figther2;

    int minWeight;
    int maxWeight;

    Match(Figther figther1,Figther figther2,int minWeight,int maxWeight){

        this.figther1=figther1;
        this.figther2=figther2;
        this.minWeight=minWeight;
        this.maxWeight=maxWeight;

    }
    void start(){

        if(isCheck()){

            while(this.figther1.healty > 0 && this.figther2.healty > 0){

                System.out.println("==========YENİ RAUND============");

                if(isSelecet()){

                    this.figther2.healty = this.figther1.hit(this.figther2);
                    if (isWin()){

                        break;
                    }
                }
                else {
                    this.figther1.healty = this.figther2.hit(this.figther1);
                    if (isWin()) {

                        break;
                    }

                }

                System.out.println(this.figther1.name + ": Sağlık " + this.figther1.healty);
                System.out.println(this.figther2.name + ": Sağlık " + this.figther2.healty);

            }


        }
        else {

            System.out.println("Sporcuların Sikletleri Uymuyor ! ");
        }
    }

    boolean isCheck(){

        return (this.figther1.weight >= minWeight && this.figther1.weight <= maxWeight) && (this.figther2.weight >= minWeight && this.figther2.weight<= maxWeight);
    }

    boolean isWin(){

        if (this.figther1.healty == 0){

            System.out.println(this.figther2.name + "Kazandı");
            return true;
        }
        if (this.figther2.healty == 0){

            System.out.println(this.figther1.name + "Kazandı ");
            return true;
        }
        return false;
    }
    boolean isSelecet(){   //hangi oyuncunun başlayacağanına %50 olasıkla karar verdirir.

        double random=Math.random()*100;
        return random <=50;

    }




}
