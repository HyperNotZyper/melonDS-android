package me.magnum.melonds.utils

import android.content.Context
import android.net.Uri
import androidx.documentfile.provider.DocumentFile
import me.magnum.melonds.utils.FileUtils.getAbsolutePathFromSAFUri
import java.io.File

object ConfigurationUtils {
    enum class ConfigurationDirStatus {
        UNSET, INVALID, VALID
    }

    @JvmStatic
	fun checkConfigurationDirectory(context: Context, configurationDir: Uri?): ConfigurationDirStatus {
        if (configurationDir == null)
            return ConfigurationDirStatus.UNSET

        val dirPath = getAbsolutePathFromSAFUri(context, configurationDir)
        val dir = File(dirPath)
        if (!dir.isDirectory)
            return ConfigurationDirStatus.INVALID

        val bios7File = DocumentFile.fromFile(File(dir, "bios7.bin"))
        val bios9File = DocumentFile.fromFile(File(dir, "bios9.bin"))
        val firmwareFile = DocumentFile.fromFile(File(dir, "firmware.bin"))

        return if (!bios7File.isFile || !bios9File.isFile || !firmwareFile.isFile)
            ConfigurationDirStatus.INVALID
        else
            ConfigurationDirStatus.VALID
    }
}