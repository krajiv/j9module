# j9module

This project contains two sample modules towards an effort to understand Java 9 modules.

The tracer module prints a message with emoticon based on the type of message supplied.

The App module depends on this tracer module.

It can be noted that the tracer exposes the API's in the tracer package and not in the emoticon package as per the module definition.
