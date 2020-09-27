虽然类图那么复杂，但从代码看，还是很容易看出建造者模式的作用。
普通的工厂方法模式中，同一类产品中不同实例对象的建造过程（SonyPhoneFactory，ApplePhoneFactory中作记号的代码），十分相似。那是不是可以抽出来，从而做到代码复用。
再看看结合了建造者模式的工厂类，就会明白建造者模式就是把建造过程抽到了导演类中（PhoneDirector中作记号的代码）。之所以能够这样，多亏了前面的多个Builder类。


又有疑问了，为了复用重复代码，却要新增那么多类，是不是有点得不偿失？

我猜，建造者模式抽取建造过程，不是为了减少代码量，而是为了把建造顺序统一到一个地方！以后一旦要修改建造顺序，也只需要修改导演类即可！

至于 抽象工厂模式-建造者模式，由于原理相似，就不哆嗦了。

小结：当一类产品中不同实例对象的建造过程相似，且未来很有可能要修改建造顺序的话，那建造者模式可以处理这种情况。

总结：从 普通的工厂方法模式 到 结合建造者模式的工厂方法模式，对产品用户（Store类）没有影响。所以对于产品用户来说，是否用建造者模式是不知情的，因为产品用户只关心产品的获取。所以正如开头所说，工厂模式用于处理 如何获取实例对象 问题，建造者模式用于处理 如何建造实例对象 问题。