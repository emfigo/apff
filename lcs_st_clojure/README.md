# LCS using suffix tree 

## Dependencies

 * [Leiningen](http://leiningen.org/)

## Usage

You can run the program directly with leiningen passing the set of strings as arguments doing:

```bash
   $ lein run GCAAGTCTAATA CAAGGTTATATA GCAATTCTATAA CAATTGATATAA GCAATCATATAT
```

Or you can compile the source:

```bash
   $ lein compile
   $ lein uberjar
```

And then run it from the jar

```bash
    $ java -jar target/uberjar/lcs-0.1.0.jar GCAAGTCTAATA CAAGGTTATATA GCAATTCTATAA CAATTGATATAA GCAATCATATAT 
```