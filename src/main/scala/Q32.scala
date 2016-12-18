package main.scala

import org.apache.spark.sql.DataFrame
import org.apache.spark.sql.SparkSession

class Q32 extends TpchQuery
{
  @Override
  override def getName(): String = "sum_price"

  override def execute(spark: SparkSession, tpchSchemaProvider: TpchSchemaProvider): DataFrame = {
    spark.sql("SELECT SUM(l_extendedprice) FROM lineitem")
  }
}