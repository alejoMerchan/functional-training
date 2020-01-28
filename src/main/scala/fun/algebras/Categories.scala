package fun.algebras

trait Categories[F[_]] {

  def findAll: F[List[Category]]

  def create(category: Category): F[Unit]


}
