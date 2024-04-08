import java.time.Instant;

public class StopWatch {
     private long endTime;
      private long startTime;

      StopWatch(){
          startTime = Instant.now().toEpochMilli();
          endTime = 0;
      }
        long getStartTime(){
          return startTime;
        }
     long getEndTime() {
         return endTime;
     }
         void start() {
             startTime = Instant.now().toEpochMilli();
         }
         void stop(){
          endTime = Instant.now().toEpochMilli();
         }
         long getElapsedTime(){
          return endTime - startTime;
         }
}
