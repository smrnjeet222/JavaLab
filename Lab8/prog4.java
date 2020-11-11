// Write a Java Class Ball, that has variable, x-position, y-position, x-speed, y-speed, 
// and radius. Implement functions, xspeed and yspeed for moving this ball in x-direction and 
// y-direction. Take input from user for the position and 
// radius and draw this moving ball using Java Applet.

import java.applet.Applet;
import java.awt.*;
import java.util.*;

public class prog4 extends Applet {
   float x, y;
   float speedX, speedY;
   float radius;
   private Color color;
   private static final Color DEFAULT_COLOR = Color.BLUE;

   public prog4(float x, float y, float radius, float speed, float angleInDegree, Color color) {
      this.x = x;
      this.y = y;
      this.speedX = (float) (speed * Math.cos(Math.toRadians(angleInDegree)));
      this.speedY = (float) (-speed * (float) Math.sin(Math.toRadians(angleInDegree)));
      this.radius = radius;
      this.color = color;
   }

   public prog4(float x, float y, float radius, float speed, float angleInDegree) {
      this(x, y, radius, speed, angleInDegree, DEFAULT_COLOR);
   }

   public void draw(Graphics g) {
      g.setColor(color);
      g.fillOval((int) (x - radius), (int) (y - radius), (int) (2 * radius), (int) (2 * radius));
   }

   public void moveOneStepWithCollisionDetection(ContainerBox box) {
      float p4MinX = box.minX + radius;
      float p4MinY = box.minY + radius;
      float p4MaxX = box.maxX - radius;
      float p4MaxY = box.maxY - radius;

      x += speedX;
      y += speedY;
      if (x < p4MinX) {
         speedX = -speedX;
         x = p4MinX;
      } else if (x > p4MaxX) {
         speedX = -speedX;
         x = p4MaxX;
      }
      if (y < p4MinY) {
         speedY = -speedY;
         y = p4MinY;
      } else if (y > p4MaxY) {
         speedY = -speedY;
         y = p4MaxY;
      }
   }

   public float getSpeed() {
      return (float) Math.sqrt(speedX * speedX + speedY * speedY);
   }

   public float getMoveAngle() {
      return (float) Math.toDegrees(Math.atan2(-speedY, speedX));
   }

   public float getMass() {
      return radius * radius * radius / 1000f;
   }

   public float getKineticEnergy() {
      return 0.5f * getMass() * (speedX * speedX + speedY * speedY);
   }

   public String toString() {
      sb.delete(0, sb.length());
      formatter.format("@(%3.0f,%3.0f) r=%3.0f V=(%2.0f,%2.0f) " + "S=%4.1f \u0398=%4.0f KE=%3.0f", x, y, radius,
            speedX, speedY, getSpeed(), getMoveAngle(), getKineticEnergy());
      return sb.toString();
   }

   private StringBuilder sb = new StringBuilder();
   private Formatter formatter = new Formatter(sb);
}
