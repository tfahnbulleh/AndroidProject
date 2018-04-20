package com.example.tamufahnbulleh.computeracronym;

import android.content.Context;

public class SearchWord
{
    private FileOperation fileOperation;
    private Context mContext;
    private  String mKeyWord;
    private  StringBuilder mResult;
    private  char mFirstLetter;
    public SearchWord(String keyword,Context context)
    {
        mContext=context;
        mKeyWord=keyword;
        mResult=new StringBuilder();
    }


    public void search()
    {
        boolean validate=isValid();
        if (validate)
        {
            setmFirstLetter();

            switch (Character.toString(mFirstLetter))
            {

                case "A":

                    fileOperation = new FileOperation("awords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "B":
                    fileOperation = new FileOperation("bwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "C":
                    fileOperation = new FileOperation("cwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;

                case "D":
                    fileOperation = new FileOperation("dwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "E":
                    fileOperation = new FileOperation("ewords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "F":
                    fileOperation = new FileOperation("fwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "G":
                    fileOperation = new FileOperation("gwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "H":
                    fileOperation = new FileOperation("hwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "I":
                    fileOperation = new FileOperation("iwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "J":
                    fileOperation = new FileOperation("jwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "K":
                    fileOperation = new FileOperation("kwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "L":
                    fileOperation = new FileOperation("lwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "M":
                    fileOperation = new FileOperation("mwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "N":
                    fileOperation = new FileOperation("nwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "O":
                    fileOperation = new FileOperation("owords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "P":
                    fileOperation = new FileOperation("pwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "Q":
                    fileOperation = new FileOperation("qwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "R":
                    fileOperation = new FileOperation("rwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "S":
                    fileOperation = new FileOperation("swords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "T":
                    fileOperation = new FileOperation("twords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "U":
                    fileOperation = new FileOperation("uwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "V":
                    fileOperation = new FileOperation("vwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "W":
                    fileOperation = new FileOperation("wwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "X":
                    fileOperation = new FileOperation("xwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "Y":
                    fileOperation = new FileOperation("ywords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;
                case "Z":
                    fileOperation = new FileOperation("zwords.txt", mKeyWord, mContext);
                    fileOperation.searchForTerm();
                    this.mResult.append(fileOperation.getSearResult());
                    break;


            }

        }
        else
        {
            mResult.append("NO MATCH FOUND");
        }
    }



    private boolean isValid()
    {
        if (this.mKeyWord.length()<1 || this.mKeyWord.equals("")||this.mKeyWord.equals(null))
        {
            return false;
        }
        else
        {
            return  true;
        }
    }

    private void setmFirstLetter()
    {
        mFirstLetter=Character.toUpperCase(mKeyWord.charAt(0));
    }

    public StringBuilder getResult()
    {
        return mResult;
    }
}
