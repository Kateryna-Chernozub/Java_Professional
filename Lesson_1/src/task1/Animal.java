package task1;

public class Animal implements Comparable<Animal>{
    String breed;
    int weight;
    int speed;
    int price;

    Animal(String breed, int weight, int speed, int price) {
        this.breed = breed;
        this.weight = weight;
        this.speed = speed;
        this.price = price;
    }

    public String toString() {
        return this.breed + " " + this.weight + " " + this.speed + " " + this.price;
    }

    // Sort by speed
    /*public int compareTo(Animal o) {
        int temp = this.speed - o.speed;

        if (temp == 0) {
            return this.price - o.price;
        } else {
            return temp;
     */
     public  int compareTo(Animal o) {
         int temp1 = this.speed - o.speed;

         if (temp1 == 0) {
             int temp2 = this.price - o.price;
             if (temp2 == 0) {
                 int temp3 = this.weight - o.weight;
                 if (temp3 == 0) {
                     return this.breed.compareTo(o.breed);
                 } else return temp3;
             } else return temp2;
         } else {
             return temp1;
         }
     }


}
