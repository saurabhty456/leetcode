class Solution {
    public boolean checkOverlap(int radius, int xcenter, int ycenter, int x1, int y1, int x2, int y2) {
      int xc=Math.max(x1,Math.min(xcenter,x2));
      int yc=Math.max(y1,Math.min(ycenter,y2));
      int distx=xc-xcenter;
      int disty=yc-ycenter;

      int sd=(distx*distx)+(disty*disty);

      return sd<=radius*radius;
    }
}