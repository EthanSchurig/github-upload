/*
 * Copyright (c) 2021 Ethan Schurig.
 *
 * Licensed under the GNU General Public License v3
 *
 * This is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 */
package code.name.score.octave.db

import androidx.room.*

@Dao
interface BlackListStoreDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBlacklistPath(blackListStoreEntity: BlackListStoreEntity)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertBlacklistPath(blackListStoreEntities: List<BlackListStoreEntity>)

    @Delete
    suspend fun deleteBlacklistPath(blackListStoreEntity: BlackListStoreEntity)

    @Query("DELETE FROM BlackListStoreEntity")
    fun clearBlacklist()

    @Query("SELECT * FROM BlackListStoreEntity")
    fun blackListPaths(): List<BlackListStoreEntity>
}
