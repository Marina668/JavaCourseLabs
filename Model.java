class Model extends CoolFirmMobile {
    @Override
    void connect() {
        System.out.println("Connected to the service");
    }

    @Override
    public void startCall(String number) {
        isTalkingNow = true;
    }

    @Override
    public String searchForCall() {
        while (true) {
            if (incomingCall) {
                if (isTalkingNow) {
                    return "Line is busy";
                } else return "Call accepted";
            }
        }
    }

    @Override
    public void acceptCall(String number) {
        isTalkingNow = true;
    }

    @Override
    public void breakCall() {
        isTalkingNow = false;
    }
}
