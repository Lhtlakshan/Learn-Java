public class time{
        private int hour;
        private int minutes;
        private int seconds;

        public time(int hour,int minutes,int seconds){
            this.hour = ((hour>=0 && hour<24) ? hour:0);
            this.minutes = ((minutes>=0 && minutes<60) ? minutes:0);
            this.seconds = ((seconds>=0 && seconds<60) ? seconds:0);
        }

        public String standTime(){
            return String.format("%02d:%02d:%02d" , hour , minutes , seconds);
        }

    public static void main(String args[]){
        

      
 }

}