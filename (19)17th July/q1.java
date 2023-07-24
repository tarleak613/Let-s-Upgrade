/* Queue Reversal */

class GfG{
    //Function to reverse the queue.
    public Queue<Integer> rev(Queue<Integer> q){
        //add code here.
        // if(q.size() == null)    return null;
        Stack<Integer> stk = new Stack<>();
        while(q.size() > 0){
            stk.push(q.poll());
        }
        while(stk.size() > 0){
            q.add(stk.pop());
        }
        return q;
    }
}

