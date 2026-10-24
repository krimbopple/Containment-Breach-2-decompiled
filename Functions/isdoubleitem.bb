Function isdoubleitem%(arg0%, arg1%)
    Local local0$
    If (((arg0 > $00) And (arg0 <> arg1)) <> 0) Then
        Select arg0
            Case T8660BZ460\Field3
                local0 = getlocalstring("msg", "weartwo.gas")
            Case T8660BZ460\Field8,T8660BZ460\Field11
                local0 = getlocalstring("msg", "weartwo.nvg")
            Case i_268\Field2,i_714\Field0,i_1499\Field8
                local0 = getlocalstring("msg", "weartwo.scps")
            Case T8660BZ460\Field7
                local0 = getlocalstring("mpmsg", "weartwo.helmet")
        End Select
        createmsg(local0, 6.0)
        selecteditem = Null
        Return $01
    EndIf
    Return $00
    Return $00
End Function
