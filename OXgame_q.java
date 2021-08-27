import java.util.*;
public class OXgame_q {
    
    public static void main(String[] args) {
        player = "x";
        Board_size();
        for(int i = 0 ; i <= 9; i++){
            if(Count == 0){
                System.out.println("OX GAME");
                Turn++;
                showboard();
                System.out.println(player + "Turn");
                System.out.println("choose your position");
                Scanner In = new Scanner(System.in);
                int pos =  In.nextInt();
                board[pos] = player;
                CountOX += 1;
                if(pos <= 8){
                    if(player.equals("x")){
                        player = "o";
                    }
                    else{
                        player = "x";
                    }
                } 
                checkwinner();
            }
            else{
                break;
            }
        }
       
    }
    static int CountOX = 0;
    static int Turn = 0;
    static int Count = 0;
    static String player;
    static int Boardsize = 0;
    static String[] board = {};

    static void Board_size(){
        Scanner size = new Scanner(System.in);
        int s = size.nextInt();
        Boardsize = s;
        for(int i = 0;i<=Boardsize*Boardsize;i++){
            board[i] += " " + ',';
        }
    }      
    static void showboard()
    {   
        //2x2
        if(Boardsize == 2){
        System.out.println("---------");
        System.out.println(  board[0] + " | "+ board[1] );
        System.out.println("---------");
        System.out.println(  board[2] + " | "+ board[3] );
        }
        //3x3
        if(Boardsize == 3){
        System.out.println("---------");
        System.out.println(  board[0] + " | "+ board[1] + " | " + board[2] );
        System.out.println("---------");
        System.out.println(  board[3] + " | "+ board[4] + " | " + board[5] );
        System.out.println("---------");
        System.out.println(  board[6] + " | "+ board[7] + " | " + board[8] );
        System.out.println("---------");
        }
        //4x4
        if(Boardsize == 4){
        System.out.println("----------------");
        System.out.println(  board[0] + " | "+ board[1] + " | " + board[2] + "|" + board[3] );
        System.out.println("----------------");
        System.out.println(  board[4] + " | "+ board[5] + " | " + board[6] + "|" + board[7]);
        System.out.println("---------------");
        System.out.println(  board[8] + " | "+ board[9] + " | " + board[10] + "|" + board[11]);
        System.out.println("---------------");
        System.out.println(  board[12] + " | "+ board[13] + " | " + board[14] + "|" + board[15]);
        }
        else{
            System.out.println("try again");
        }

        
    } 
    
    static void checkwinner()
    {
        for (int i = 0; i < 8; i++) {
            String line = null;
            switch (i) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }
            if(line.equals("xxx")) {
                System.out.println("X Win");
                Count = 1;
                break;
            }
            else if(line.equals("ooo")) {
                System.out.println("O Win");
                Count = 1;
                break;
            }
            if(CountOX == 9){
                System.out.println("Draw");
                Count = 1;
                break;
                
            }

        }
    }
    
    
    
    
    
}

