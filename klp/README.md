Write a function that takes an input:

{:a {:b {:c :foobar}}
 :e :test
 :d "test"
 :h []
 :z {:l 1 :g 3 :p :bar}
 :asc {:asx :foo}}

And returns this ouput

#{[:e] [:a :b :c] [:z :p] [:asc :asx]}

If a leaf is a keyword you want the whole path