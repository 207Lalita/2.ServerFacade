package serverwofacade;

public class ServerWOFacade {
    // public static void main(String[] args) {
    //     ScheduleServer scheduleServer = new ScheduleServer();
    public void startServer() {
        ScheduleServer startServer = new ScheduleServer();
        startServer.startBooting();
        startProcess(startServer);
    }

    public void startProcess(ScheduleServer serve){
        serve.readSystemConfigFile();
	    serve.init();
	    serve.initializeContext();
        serve.initializeListeners();
	    serve.createSystemObjects();
    }

    public void stopServer(){
        ScheduleServer stopServer = new ScheduleServer();
        stopProcess(stopServer);
        stopServer.shutdown();
    }

    public void stopProcess(ScheduleServer serve){
        serve.releaseProcesses();
        serve.destory();
        serve.destroySystemObjects();
        serve.destoryListeners();
        serve.destoryContext();
    }
}
    

