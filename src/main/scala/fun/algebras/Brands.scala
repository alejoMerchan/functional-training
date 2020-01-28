package fun.algebras

trait Brands[F[_]] {


  def findAll: F[List[Brand]]

  def create(brand: Brand): F[Unit]

}
