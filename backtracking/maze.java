public class maze {
    public static void main(String[] args) {
        // System.out.println(track(3, 3));
        // trackPrint("", 3, 3);
        trackPrintDiagonal("", 3, 3);
    }
    static int track(int row,int col){
        if (row == 1 || col == 1) {
            return 1;
        }
        int left = track(row-1, col);
        int right = track(row, col-1);
        return left + right ;

    }

    static void trackPrint(String process,int row,int col){
        if (row == 1 && col == 1) {
            System.out.println(process);
            return;
        }
        if (row>1) {
            trackPrint(process+'D', row-1, col);
        }
        if (col > 1) {
            trackPrint(process+'R', row, col-1);
        }
    }

    static void trackPrintDiagonal(String process,int row,int col){
        if (row == 1 && col == 1) {
            System.out.println(process);
            return;
        }
        if (row > 1 && col > 1) {
            trackPrintDiagonal(process+'G', row-1, col-1);
        }
        if (row>1) {
            trackPrintDiagonal(process+'D', row-1, col);
        }
        if (col > 1) {
            trackPrintDiagonal(process+'R', row, col-1);
        }
    }





    
}
