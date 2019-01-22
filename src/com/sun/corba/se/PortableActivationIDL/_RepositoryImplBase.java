package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/_RepositoryImplBase.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from ../../../../src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Monday, September 24, 2012 12:05:44 PM PDT
*/

public abstract class _RepositoryImplBase extends org.omg.CORBA.portable.ObjectImpl
                implements com.sun.corba.se.PortableActivationIDL.Repository, org.omg.CORBA.portable.InvokeHandler
{

  // Constructors
  public _RepositoryImplBase ()
  {
  }

  private static java.util.Hashtable _methods = new java.util.Hashtable ();
  static
  {
    _methods.put ("registerServer", new java.lang.Integer (0));
    _methods.put ("unregisterServer", new java.lang.Integer (1));
    _methods.put ("getServer", new java.lang.Integer (2));
    _methods.put ("isInstalled", new java.lang.Integer (3));
    _methods.put ("install", new java.lang.Integer (4));
    _methods.put ("uninstall", new java.lang.Integer (5));
    _methods.put ("listRegisteredServers", new java.lang.Integer (6));
    _methods.put ("getApplicationNames", new java.lang.Integer (7));
    _methods.put ("getServerID", new java.lang.Integer (8));
  }

  public org.omg.CORBA.portable.OutputStream _invoke (String $method,
                                org.omg.CORBA.portable.InputStream in,
                                org.omg.CORBA.portable.ResponseHandler $rh)
  {
    org.omg.CORBA.portable.OutputStream out = null;
    java.lang.Integer __method = (java.lang.Integer)_methods.get ($method);
    if (__method == null)
      throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);

    switch (__method.intValue ())
    {

  /** register server definition.
  	* This returns the serverId of the server.  A newly created server is
  	* always uninstalled.
  	*/
       case 0:  // PortableActivationIDL/Repository/registerServer
       {
         try {
           com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef serverDef = com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDefHelper.read (in);
           String $result = null;
           $result = this.registerServer (serverDef);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (com.sun.corba.se.PortableActivationIDL.ServerAlreadyRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerAlreadyRegisteredHelper.write (out, $ex);
         } catch (com.sun.corba.se.PortableActivationIDL.BadServerDefinition $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.BadServerDefinitionHelper.write (out, $ex);
         }
         break;
       }


  /** unregister server definition
  	*/
       case 1:  // PortableActivationIDL/Repository/unregisterServer
       {
         try {
           String serverId = org.omg.PortableInterceptor.ServerIdHelper.read (in);
           this.unregisterServer (serverId);
           out = $rh.createReply();
         } catch (com.sun.corba.se.PortableActivationIDL.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  /** get server definition
  	*/
       case 2:  // PortableActivationIDL/Repository/getServer
       {
         try {
           String serverId = org.omg.PortableInterceptor.ServerIdHelper.read (in);
           com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDef $result = null;
           $result = this.getServer (serverId);
           out = $rh.createReply();
           com.sun.corba.se.PortableActivationIDL.RepositoryPackage.ServerDefHelper.write (out, $result);
         } catch (com.sun.corba.se.PortableActivationIDL.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  /** Return whether the server has been installed
  	*/
       case 3:  // PortableActivationIDL/Repository/isInstalled
       {
         try {
           String serverId = org.omg.PortableInterceptor.ServerIdHelper.read (in);
           boolean $result = false;
           $result = this.isInstalled (serverId);
           out = $rh.createReply();
           out.write_boolean ($result);
         } catch (com.sun.corba.se.PortableActivationIDL.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }


  /** Mark the server as being installed.  Raises ServerAlreadyInstalled
  	* if the server is currently marked as installed.
  	*/
       case 4:  // PortableActivationIDL/Repository/install
       {
         try {
           String serverId = org.omg.PortableInterceptor.ServerIdHelper.read (in);
           this.install (serverId);
           out = $rh.createReply();
         } catch (com.sun.corba.se.PortableActivationIDL.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.write (out, $ex);
         } catch (com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalled $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerAlreadyInstalledHelper.write (out, $ex);
         }
         break;
       }


  /** Mark the server as being uninstalled.  Raises ServerAlreadyUninstalled
  	* if the server is currently marked as uninstalled.
  	*/
       case 5:  // PortableActivationIDL/Repository/uninstall
       {
         try {
           String serverId = org.omg.PortableInterceptor.ServerIdHelper.read (in);
           this.uninstall (serverId);
           out = $rh.createReply();
         } catch (com.sun.corba.se.PortableActivationIDL.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.write (out, $ex);
         } catch (com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalled $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerAlreadyUninstalledHelper.write (out, $ex);
         }
         break;
       }


  /** list registered servers
  	*/
       case 6:  // PortableActivationIDL/Repository/listRegisteredServers
       {
         String $result[] = null;
         $result = this.listRegisteredServers ();
         out = $rh.createReply();
         com.sun.corba.se.PortableActivationIDL.ServerIdsHelper.write (out, $result);
         break;
       }


  /** Returns list of ALL applicationNames defined in ServerDefs of registered 
  	* servers.
  	*/
       case 7:  // PortableActivationIDL/Repository/getApplicationNames
       {
         String $result[] = null;
         $result = this.getApplicationNames ();
         out = $rh.createReply();
         com.sun.corba.se.PortableActivationIDL.RepositoryPackage.AppNamesHelper.write (out, $result);
         break;
       }


  /** Find the ServerID associated with the given application name.
  	*/
       case 8:  // PortableActivationIDL/Repository/getServerID
       {
         try {
           String applicationName = in.read_string ();
           String $result = null;
           $result = this.getServerID (applicationName);
           out = $rh.createReply();
           out.write_string ($result);
         } catch (com.sun.corba.se.PortableActivationIDL.ServerNotRegistered $ex) {
           out = $rh.createExceptionReply ();
           com.sun.corba.se.PortableActivationIDL.ServerNotRegisteredHelper.write (out, $ex);
         }
         break;
       }

       default:
         throw new org.omg.CORBA.BAD_OPERATION (0, org.omg.CORBA.CompletionStatus.COMPLETED_MAYBE);
    }

    return out;
  } // _invoke

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:PortableActivationIDL/Repository:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }


} // class _RepositoryImplBase