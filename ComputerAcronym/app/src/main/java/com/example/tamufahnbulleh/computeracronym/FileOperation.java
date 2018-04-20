package com.example.tamufahnbulleh.computeracronym;

import android.content.Context;
import android.content.res.AssetManager;
import android.widget.Toast;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class FileOperation
{
    private String mFilePath;
    private StringBuilder mSearResult;
    private String mSearchTerm;
    private AssetManager mAssetManager;
    private BufferedReader mBufferedReader;
    private Context mContext;

    private BufferedWriter mBufferedWriter;
    private FileWriter mFileWriter;

    public FileOperation(String filePath, String searchTerm,Context context)
    {
        this.mFilePath=filePath;
        this.mSearchTerm=searchTerm;
        this.mContext=context;
        mAssetManager=context.getAssets();
    }

    public StringBuilder getSearResult()
    {
        return mSearResult;
    }

    public void searchForTerm()
    {
        mSearResult=new StringBuilder();
        try
        {
            mBufferedReader=new BufferedReader(new InputStreamReader(mContext.getAssets().open(mFilePath))); //open text file
            String data; //store each line read
            while((data=mBufferedReader.readLine())!=null) //loop through the text file
            {
                data=data.trim();
                mSearchTerm.trim();

                if (data.equalsIgnoreCase(mSearchTerm))
                {
                    mSearResult.append(data+"\n"+mBufferedReader.readLine()+"\n\n");
                }
            }
        }
        catch (IOException ex)
        {

        }

    }


}
