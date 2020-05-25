# Toy Example Box SPL

This is meant as a toy example of an "annotative" [software product line](https://en.wikipedia.org/wiki/Software_product_line) (SPL). An annotative SPL consists of three parts:
  * A Feature Model: represents the points of variability and their dependencies
  * A Domain Model: represents all possible elements that a product of the SPL could have
  * A Feature Mapping: represents what elements are allowed in each product
  
In this little example, the feature model and the feature mapping are encoded as propositional (aka boolean) expressions in a [CSV file](https://en.wikipedia.org/wiki/Comma-separated_values). There are two features with the inspired names "f1" and f2". The domain model is a simple set of three "box" items (a, b, and c). The feature mapping is done by assigning to each box a "presence condition" in the CSV.

The language used for propositional expressions is [SMT-LIB](http://smtlib.cs.uiowa.edu/language.shtml), which is the langauge used as input by the [Z3 solver](https://github.com/Z3Prover/z3). You can learn more about Z3 and how to use it on [Rise4Fun](https://rise4fun.com/z3/tutorial).

The example consists of four files:
  * [spl.csv](https://github.com/mfamelis/toyExampleBoxSPL/blob/master/spl.csv): the "CSV file" mentioned above
  * [BoxModel.java](https://github.com/mfamelis/toyExampleBoxSPL/blob/master/src/ca/umontreal/iro/geodes/boxspl/BoxModel.java): a [POJO](https://en.wikipedia.org/wiki/Plain_old_Java_object) implementation of a simple metamodel: A BoxModel can contain Box objects, each of which can contain other Box objects. 
  * [Box.java](https://github.com/mfamelis/toyExampleBoxSPL/blob/master/src/ca/umontreal/iro/geodes/boxspl/Box.java): a POJO implementation of the Box metaclass.
  * [Example.java](https://github.com/mfamelis/toyExampleBoxSPL/blob/master/src/ca/umontreal/iro/geodes/boxspl/Example.java): the actual example. Read the inline comments to see what is happening.
  
![metamodel](https://yuml.me/diagram/boring/class/[BoxModel]<>boxes-[Box|id:String]<>contents-[Box])

Comments and suggestions are welcome at famelis@iro.umontreal.ca.


