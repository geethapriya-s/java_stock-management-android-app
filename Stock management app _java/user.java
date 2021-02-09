package com.example.best;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

public final class user {
   private int id;
   @NotNull
   private String name;
   private int no_of_roles;
   private int weight;
   private int total_weight;

   public final int getId() {
      return this.id;
   }

   public final void setId(int var1) {
      this.id = var1;
   }

   @NotNull
   public final String getName() {
      return this.name;
   }

   public final void setName(@NotNull String var1) {
      Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
      this.name = var1;
   }

   public final int getNo_of_roles() {
      return this.no_of_roles;
   }

   public final void setNo_of_roles(int var1) {
      this.no_of_roles = var1;
   }

   public final int getWeight() {
      return this.weight;
   }

   public final void setWeight(int var1) {
      this.weight = var1;
   }

   public final int getTotal_weight() {
      return this.total_weight;
   }

   public final void setTotal_weight(int var1) {
      this.total_weight = var1;
   }

   public user(@NotNull String name, int no_of_roles, int weight, int total_weight) {
      Intrinsics.checkParameterIsNotNull(name, "name");
      super();
      this.name = "";
      this.name = name;
      this.no_of_roles = no_of_roles;
      this.weight = weight;
      this.total_weight = total_weight;
   }
}

