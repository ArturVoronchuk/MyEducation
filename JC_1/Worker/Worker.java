package JC_1.Worker;

public class Worker {
    private OnTaskDoneListener doneCallback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener doneCallback, OnTaskErrorListener errorCallback) {
        this.doneCallback = doneCallback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if(i == 33) {
                errorCallback.onError("Task " + i + " is error");
            } else {
                doneCallback.onDone("Task " + i + " is done");
            }
        }
    }
}
