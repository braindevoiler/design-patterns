package com.braindevoiler.designpattern.structural.bridge;

public class BridgeTest {
    /*
     * Use the Bridge Pattern to vary not only your implementations, but also your abstractions. It decouple an
     * abstraction from its implementation so that the two can vary independently.
     *
     * Implementation: Decompose the component's interface and implementation into orthogonal class hierarchies. The
     * interface class contains a pointer to the abstract implementation class. This pointer is initialized with an
     * instance of a concrete implementation class, but all subsequent interaction from the interface class to the
     * implementation class is limited to the abstraction maintained in the implementation base class. The client
     * interacts with the interface class, and it in turn "delegates" all requests to the implementation class.
     *
     * Benefits:
     * 1. It decouples an implementation so that it is not bound permanently to an interface.
     * 2. Abstraction and implementation can be extended independently.
     * 3. Changes to the concrete abstraction classes don't affect the client.
     * 4. Useful in graphic and windowing systems that need to run over multiple platforms.
     *
     */
    public static void main(String args[]) {
        Tv sonyTv = new SonyTv();
        Tv samsungTv = new SamsungTv();

        RemoteControl sonyTvOldRemote = new RemoteControl(sonyTv);
        RemoteControl samsungTvOldRemote = new RemoteControl(samsungTv);
        ConcreteRemote sonyTvNewRemote = new ConcreteRemote(sonyTv, 10);
        ConcreteRemote samsungTvNewRemote = new ConcreteRemote(samsungTv, 10);

        sonyTvOldRemote.on();
        sonyTvOldRemote.setChannel(15);
        sonyTvOldRemote.off();

        samsungTvOldRemote.on();
        samsungTvOldRemote.setChannel(25);
        samsungTvOldRemote.off();


        sonyTvNewRemote.on();
        sonyTvNewRemote.nextChannel();
        sonyTvNewRemote.previousChannel();
        sonyTvNewRemote.off();

        samsungTvNewRemote.on();
        samsungTvNewRemote.nextChannel();
        samsungTvNewRemote.previousChannel();
        samsungTvNewRemote.off();

    }
}
