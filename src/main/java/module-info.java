module netty.socketio {
  exports codes.oss.socketio;
  exports codes.oss.socketio.ack;
  exports codes.oss.socketio.annotation;
  exports codes.oss.socketio.handler;
  exports codes.oss.socketio.listener;
  exports codes.oss.socketio.namespace;
  exports codes.oss.socketio.misc;
  exports codes.oss.socketio.messages;
  exports codes.oss.socketio.protocol;

  requires static spring.beans;
  requires static spring.core;

  requires com.fasterxml.jackson.core;
  requires com.fasterxml.jackson.annotation;
  requires com.fasterxml.jackson.databind;

  requires static com.hazelcast.core;

  requires static redisson;

  requires static io.netty.transport.classes.epoll;
  requires io.netty.codec;
  requires io.netty.handler;
  requires io.netty.codec.http;
    requires io.netty.transport.classes.io_uring;
    requires io.netty.transport;
    requires io.netty.buffer;
    requires io.netty.common;
    requires org.slf4j;
}
