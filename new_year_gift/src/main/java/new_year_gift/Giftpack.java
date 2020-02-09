package new_year_gift;

abstract class Giftpack {
        abstract void display();
        private int price;
        private int weight;
        public Giftpack(int price,int weight) {
        	this.price=price;
        	this.weight=weight;
        }
        public int getPrice() {
        	return price;
        }
        public int getWeight() {
        	return weight;
        }
        public String toString() {
        	return "Price :Rs."+this.price+"\n Weight:"+this.weight;
        }
}
