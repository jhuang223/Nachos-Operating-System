package nachos.threads;

import nachos.machine.*;

import java.util.TreeSet;
import java.util.HashSet;
import java.util.Iterator;

/**
 * A scheduler that chooses threads using a lottery.
 *
 * <p>
 * A lottery scheduler associates a number of tickets with each thread. When a
 * thread needs to be dequeued, a random lottery is held, among all the tickets
 * of all the threads waiting to be dequeued. The thread that holds the winning
 * ticket is chosen.
 *
 * <p>
 * Note that a lottery scheduler must be able to handle a lot of tickets
 * (sometimes billions), so it is not acceptable to maintain state for every
 * ticket.
 *
 * <p>
 * A lottery scheduler must partially solve the priority inversion problem; in
 * particular, tickets must be transferred through locks, and through joins.
 * Unlike a priority scheduler, these tickets add (as opposed to just taking
 * the maximum).
 */
public class LotteryScheduler extends PriorityScheduler {

    // initialize min value for lowest priority
    public static final int PRIORITY_MINIMUM = 1;

    //initialize max value for highest priority
    public static final int PRIORITY_MAXIMUM = Integer.MAX_VALUE;   //initialize max value for highest priority

    /**
     * Allocate a new lottery scheduler.
     */
    public LotteryScheduler() {
    }


    /*@Override
    public ThreadQueue newThreadQueue(boolean transferPriority) {
        retunrn new LotteryQueue(transferPriority);
    }

    @Override
    public int getPriority(KThread thread) {
        Lib.assertTrue(Machine.interrupt().disabled());

        return getThreadState(thread).getPriority();
    }

    @Override
    public int getEffectivePriority(KThread thread) {
        Lib.assertTrue(Machine.interrupt().disabled());

        return getThreadState(thread).getEffectivePriority();
    }

    @Override
    protected ThreadState getThreadState(KThread thread) {

    }

    public void setPriority(KThread thread, int priority) {
        // Check to see if interrupt disabled
        Lib.assertTrue(Machine.interrupt().disabled());

        //Lib.assertTrue(priority >= PRIORITY_MINIMUM);
        Lib.assertTrue(priority >= priorityMinimum
                && priority <= priorityMaximum);
        // set priority
        getThreadState(thread).setPriority(priority);
    }

    public boolean increasePriority() {
        // disable interrupt
        Machine.interrupt().disable();

        KThread thread = KThread.currentThread();
        int priority = getPriority(thread);
        // return false if priority is equaled to max priority
        if(priority == PRIORITY_MAXIMUM)
            return false;
        // set current priority to +1 higher
        setPriority(thread, priority+1);

        Machine.interrupt().enable();
        return true;
    }

    public boolean decreasePriority() {
        //disable interrupt
        Machine.interrupt().disable();

        KThread thread = KThread.currentThread();
        int priority = getPriority(thread);
        // if priority equal min priority, return false
        if(priority == PRIORITY_MINIMUM)
            return false;
        setPriority(thread, priority+1);

        Machine.interrupt().enable();
        return true;
    }

    protected class LotteryQueue extends PriorityScheduler.PriorityQueue{
        LotteryQueue(boolean transferPriority){
            super(transferPriority);
        }

        public ThreadState pickNextThread() {
            // implement me senpai David :)
            int totalTickets = getEffectivePriority(); //should be sum of tickets

            if(totalTickets == 0)
                return null

        }



    }

    protected class ThreadState extends PriorityScheduler.ThreadState {
        public ThreadState(KThread thread) {
            super(thread);
        }

        public int getEffectivePriority() {
            int ticket = mystate.priority;

            for (PriorityQueue myQueue : mystate.donateQueue) {
                for (KThread currentThread : myQueue.waitQueue) {
                    if (getThreadState(currentThread) == mystate)
                        continue;
                    tickets += getThreadState(currentThread).getEffectivePriority();
                }
            }
            return tickets;
        }
    }*/


    /**
     * Allocate a new lottery thread queue.
     *
     * @param	transferPriority	<tt>true</tt> if this queue should
     *					transfer tickets from waiting threads
     *					to the owning thread.
     * @return	a new lottery thread queue.
     */
    /**
     public ThreadQueue newThreadQueue(boolean transferPriority) {
     // implement me
     return null;
     }
     */
}