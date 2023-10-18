// YOUTUBE VIDEO REFER : https://www.youtube.com/watch?v=QDBrZFROuA0&list=PL-Jc9J83PIiFxaBahjslhBD1LiJAV7nKs&index=12&ab_channel=Pepcoding

// the concept is that 
// we ahve three pipes A B and C 
// and we have 3 disks in A, biggest , smaller and then the smallest

// so we a have to move all of them to B and rules are
// move 1 disk at a time
// never place smaller disk on larger disk can only move disk at the top

// sample output
// 3 --> number of disks 
// 10
// 11 
// 12
// move disks from 1st tower to 2nd tower using 3rd tower as help
// 10 11 12 are the names of the tower then output will be

// 1 10 -> 11
// 2 10 -> 12
// 1 11 -> 12
// 3 10 -> 11
// 1 12 -> 10
// 2 12 -> 11
// 1 10 -> 11

// here the game is simple , we create a faith , like we assume that how we fcan move 2 disk, so now we can move 3disk as well

// so here what we do is we move the top 2 disk to thiord and then 3rd to the 2nd pole and then move back the 2diskfrom third pole to 2nd pole

//SO IF WE KNOW HOW TO MOVE 2 DISKS SO WE CAN MOVE 3 DISKS AS WELL

// THE SOLUTION IS     
// toh(3,A,B,C) is

// toh(2,a,c,b)--that is move 2disks form a to c using B
// 3(a to b) -->print the third disk i.e. move the third disk from tower a to tower b
// toh(2,c,b,a) now move the two disks from tower c to  tower b 
// and this way we move all the disk from a to B
// and here whatever we did we followed all the rules to do the operations

import java.util.Scanner;

public class recurTowerOfHanoi {

    public static void toh(int n, int t1id, int t2id, int t3id) {
        if (n == 0) {
            return;
        }
        toh(n - 1, t1id, t3id, t2id); // will move n-1 disks from t1 to t3 using t2 // this is the left call
        System.out.println(n + "[" + t1id + "->" + t2id + "]"); // this is the in area
        toh(n - 1, t3id, t2id, t1id); // this is the right call
    }

    // here we are going to see is that the how left call and right call is working
    // adn we are pnly printing th in area , and eventually if we make the euler
    // tree we we will see that we have followed all the rules that are required adn
    // we are able to get the solution
    // here we had trust in our faith , adn our faith was that if we move 2 disks
    // then we will be able to move 3 disks as well , here we moved 2 disks using
    // the left call and as we trusted our faith , we were able to get the solutoion
    // with all the rules beign followed
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t1d = sc.nextInt();
        int t2d = sc.nextInt();
        int t3d = sc.nextInt();
        toh(n, t1d, t2d, t3d);

    }
}
