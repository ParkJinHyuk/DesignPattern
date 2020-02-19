Observer Pattern
- import java.util.observable, observer를 이용해서 구현 가능
- example은 간단히 subject, observer 만들어서 구현

Why necessary setChange()
- minor fluctuation까지 notify하기 싫어서, major할때만 notify하려고
