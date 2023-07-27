public class Figther {

    String name;
    int damage;
    int healty;
    int weight;
    int dodge;

    Figther(String name,int damage,int healty,int weight,int dodge){

        this.name=name;
        this.damage=damage;
        this.healty=healty;
        this.weight=weight;
        if (dodge >= 0 && dodge <=100 ){
            this.dodge=dodge;
        }
        else {

            this.dodge=0;
        }


    }
    int hit(Figther foe){
        System.out.println(this.name + "=>" +" "+ foe.name + " " + this.damage+" " + "hasar vurdu");
        if (isDodge()){

            System.out.println(foe.name + "Gelen Hasarı Blokladı !");
            System.out.println("----------------------------------");
            return foe.healty;
        }

        if (foe.healty - this.damage < 0){
            return 0;
        }

        return foe.healty-this.damage;
    }
    boolean isDodge(){

        double random=Math.random()*100;
        return random <= this.dodge;
    }




}
