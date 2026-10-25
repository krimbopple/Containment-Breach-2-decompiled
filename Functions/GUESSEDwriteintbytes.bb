Function GUESSEDwriteintbytes%(arg0%, arg1%, arg2%, arg3%, arg4%)
    _Memory_PokeInt(arg1, ((arg0 And $FF000000) Shr $18))
    _Memory_PokeInt(arg2, ((arg0 And $FF0000) Shr $10))
    _Memory_PokeInt(arg3, ((arg0 And $FF00) Shr $08))
    _Memory_PokeInt(arg4, (arg0 And $FF))
    Return $00
End Function
