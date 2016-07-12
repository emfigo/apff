# KLP

This is not the most efficient or elegant solution but is what I did during my flight

## Dependencies

 * [Leiningen](http://leiningen.org/)

## Usage

You can run the program directly with leiningen passing the sequence of numbers as an argument separated by commas doing:

```bash
   $ lein run "{:a {:b {:c :foobar}}, :e :test, :d "test", :h [], :z {:l 1, :g 3, :p :bar}, :asc {:asx :foo}}"
```

Or you can compile the source:

```bash
   $ lein compile
   $ lein uberjar
```

And then run it from the jar

```bash
    $ java -jar target/uberjar/klp-0.1.0.jar "{:a {:b {:c :foobar}}, :e :test, :d "test", :h [], :z {:l 1, :g 3, :p :bar}, :asc {:asx :foo}}"
```
