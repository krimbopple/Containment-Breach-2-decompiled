Function setdifficultycolor%(arg0%, arg1%, arg2%, arg3%)
    difficulties[arg0]\Field9 = arg1
    difficulties[arg0]\Field5 = arg2
    difficulties[arg0]\Field3 = arg3
    Return $00
End Function
