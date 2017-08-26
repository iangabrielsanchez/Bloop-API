package com.tdc.bloop.listener.model

import groovy.transform.CompileStatic

/**
 * BloopSettings is a class that contains all the
 * parameters required for blooping across the network.
 *
 * @since 1.0
 * @author Ian Gabriel Sanchez
 */
@CompileStatic
class BloopSettings extends Object {

    int timeout
    int tcpPort
    int udpPort
    int bufferSize
    String applicationVersion

    /**
     * Creates a new instance of BloopSettings with the default values.
     * The default values are:
     * <ul>
     * <li>timeout: 5000
     * <li>tcpPort: 25667
     * <li>udpPort: 25668
     * <li>bufferSize: 1024
     * <li>applicationVersion: '1.0.0'
     * </ul>
     */
    BloopSettings() {
        timeout = 5000
        tcpPort = 25667
        udpPort = 25668
        bufferSize = 1024
        applicationVersion = '1.0.0'
    }

    /**
     * Creates a new instance of BloopSettings with the specified parameters
     * @param applicationVersion The version of your application
     * @param host The IP Address or Computer name of the host
     * @param tcpPort The port that will be used for the BloopServer
     * @param udpPort The port that will be used for network discovery
     * @param timeout The timeout before the application decides that it's waiting too long
     */
    BloopSettings( String applicationVersion, int tcpPort, int udpPort, int timeout, int bufferSize ) {
        this.applicationVersion = applicationVersion
        this.tcpPort = tcpPort
        this.udpPort = udpPort
        this.timeout = timeout
        this.bufferSize = bufferSize
    }

}