// here we will have 2 recursive calls
//THIS CONCEPT IS MORE USED IN CASE OF TREES
public class recurZigZag {
    public static void main(String[] args) {
        // there is one basic concept that whatever is written before the recurtsion
        // call statement gets excuted while moving upwards or to the end of the node
        // and the statemtn after gets executed while coming back fromt the end of the
        // node

        // exaple we have a code like
        // SOP(pre+n)
        // function(n-1) this is the left call
        // SOP(in+n)
        // funtion(n-1) this is the right call
        // SOP(post+n)
        // here we are hacing 2 timerecursion being called and this is situation where
        // we are going to have PRE IN POST

        // here we use euler to verify this kind of situations

        // whenever we are here we are going through pre area then left call then in
        // call then in area then right call then post area

    }
}