module dev.mccue.guava.xml {
    requires static com.google.errorprone.annotations;
    requires static dev.mccue.jsr305;
    requires static org.checkerframework.checker.qual;

    requires transitive dev.mccue.guava.escape;

    exports dev.mccue.guava.xml;
}