package poc.opencensus.pocopencensus.hello

import org.springframework.data.repository.CrudRepository
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id


@Entity
data class HelloEntity(@Id var id: Int = 0, @Column var name: String = "", @Column var text: String = "")

interface HelloRepository : CrudRepository<HelloEntity, Long> {
    fun findByName(lastName: String): List<HelloEntity>
}