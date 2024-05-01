import SwiftUI
import shared

struct ContentView: View {
    @State var counter = CountModel(count:0)
    @State private var count: Int32 = 0
	var body: some View {
        VStack(content: {
            Text("Count: \(count)").padding(20)
            Button("Increment") {
                           counter.increment()
                           count = counter.count
                       }
                       Button("Decrement") {
                           counter.decrement()
                           count = counter.count
                       }.padding(10)
        })
        .frame(minWidth: 0, maxWidth: .infinity, minHeight: 0, maxHeight: .infinity).background(Color.white)
	}
}

struct ContentView_Previews: PreviewProvider {
	static var previews: some View {
		ContentView()
	}
}
