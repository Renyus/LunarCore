// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;
import us.hebi.quickbuf.RepeatedInt;
import us.hebi.quickbuf.RepeatedMessage;

public final class GetSceneMapInfoScRspOuterClass {
  /**
   * Protobuf type {@code GetSceneMapInfoScRsp}
   */
  public static final class GetSceneMapInfoScRsp extends ProtoMessage<GetSceneMapInfoScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 1;</code>
     */
    private int retcode;

    /**
     * <code>optional uint32 entry_id = 6;</code>
     */
    private int entryId;

    /**
     * <code>optional uint32 cur_map_entry_id = 10;</code>
     */
    private int curMapEntryId;

    /**
     * <code>repeated uint32 unlocked_teleport_list = 3;</code>
     */
    private final RepeatedInt unlockedTeleportList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated uint32 lighten_section_list = 9;</code>
     */
    private final RepeatedInt lightenSectionList = RepeatedInt.newEmptyInstance();

    /**
     * <code>repeated .MazeMapData map_list = 2;</code>
     */
    private final RepeatedMessage<MazeMapDataOuterClass.MazeMapData> mapList = RepeatedMessage.newEmptyInstance(MazeMapDataOuterClass.MazeMapData.getFactory());

    /**
     * <code>repeated .MazeProp maze_prop_list = 8;</code>
     */
    private final RepeatedMessage<MazePropOuterClass.MazeProp> mazePropList = RepeatedMessage.newEmptyInstance(MazePropOuterClass.MazeProp.getFactory());

    /**
     * <code>repeated .MazeGroup maze_group_list = 13;</code>
     */
    private final RepeatedMessage<MazeGroupOuterClass.MazeGroup> mazeGroupList = RepeatedMessage.newEmptyInstance(MazeGroupOuterClass.MazeGroup.getFactory());

    /**
     * <code>repeated .MazeChest unlocked_chest_list = 14;</code>
     */
    private final RepeatedMessage<MazeChestOuterClass.MazeChest> unlockedChestList = RepeatedMessage.newEmptyInstance(MazeChestOuterClass.MazeChest.getFactory());

    private GetSceneMapInfoScRsp() {
    }

    /**
     * @return a new empty instance of {@code GetSceneMapInfoScRsp}
     */
    public static GetSceneMapInfoScRsp newInstance() {
      return new GetSceneMapInfoScRsp();
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 1;</code>
     * @param value the retcode to set
     * @return this
     */
    public GetSceneMapInfoScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @return whether the entryId field is set
     */
    public boolean hasEntryId() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearEntryId() {
      bitField0_ &= ~0x00000002;
      entryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @return the entryId
     */
    public int getEntryId() {
      return entryId;
    }

    /**
     * <code>optional uint32 entry_id = 6;</code>
     * @param value the entryId to set
     * @return this
     */
    public GetSceneMapInfoScRsp setEntryId(final int value) {
      bitField0_ |= 0x00000002;
      entryId = value;
      return this;
    }

    /**
     * <code>optional uint32 cur_map_entry_id = 10;</code>
     * @return whether the curMapEntryId field is set
     */
    public boolean hasCurMapEntryId() {
      return (bitField0_ & 0x00000004) != 0;
    }

    /**
     * <code>optional uint32 cur_map_entry_id = 10;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearCurMapEntryId() {
      bitField0_ &= ~0x00000004;
      curMapEntryId = 0;
      return this;
    }

    /**
     * <code>optional uint32 cur_map_entry_id = 10;</code>
     * @return the curMapEntryId
     */
    public int getCurMapEntryId() {
      return curMapEntryId;
    }

    /**
     * <code>optional uint32 cur_map_entry_id = 10;</code>
     * @param value the curMapEntryId to set
     * @return this
     */
    public GetSceneMapInfoScRsp setCurMapEntryId(final int value) {
      bitField0_ |= 0x00000004;
      curMapEntryId = value;
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 3;</code>
     * @return whether the unlockedTeleportList field is set
     */
    public boolean hasUnlockedTeleportList() {
      return (bitField0_ & 0x00000008) != 0;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 3;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearUnlockedTeleportList() {
      bitField0_ &= ~0x00000008;
      unlockedTeleportList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 3;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedTeleportList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getUnlockedTeleportList() {
      return unlockedTeleportList;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 3;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableUnlockedTeleportList() {
      bitField0_ |= 0x00000008;
      return unlockedTeleportList;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 3;</code>
     * @param value the unlockedTeleportList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addUnlockedTeleportList(final int value) {
      bitField0_ |= 0x00000008;
      unlockedTeleportList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 unlocked_teleport_list = 3;</code>
     * @param values the unlockedTeleportList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addAllUnlockedTeleportList(final int... values) {
      bitField0_ |= 0x00000008;
      unlockedTeleportList.addAll(values);
      return this;
    }

    /**
     * <code>repeated uint32 lighten_section_list = 9;</code>
     * @return whether the lightenSectionList field is set
     */
    public boolean hasLightenSectionList() {
      return (bitField0_ & 0x00000010) != 0;
    }

    /**
     * <code>repeated uint32 lighten_section_list = 9;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearLightenSectionList() {
      bitField0_ &= ~0x00000010;
      lightenSectionList.clear();
      return this;
    }

    /**
     * <code>repeated uint32 lighten_section_list = 9;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableLightenSectionList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getLightenSectionList() {
      return lightenSectionList;
    }

    /**
     * <code>repeated uint32 lighten_section_list = 9;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableLightenSectionList() {
      bitField0_ |= 0x00000010;
      return lightenSectionList;
    }

    /**
     * <code>repeated uint32 lighten_section_list = 9;</code>
     * @param value the lightenSectionList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addLightenSectionList(final int value) {
      bitField0_ |= 0x00000010;
      lightenSectionList.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 lighten_section_list = 9;</code>
     * @param values the lightenSectionList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addAllLightenSectionList(final int... values) {
      bitField0_ |= 0x00000010;
      lightenSectionList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .MazeMapData map_list = 2;</code>
     * @return whether the mapList field is set
     */
    public boolean hasMapList() {
      return (bitField0_ & 0x00000020) != 0;
    }

    /**
     * <code>repeated .MazeMapData map_list = 2;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearMapList() {
      bitField0_ &= ~0x00000020;
      mapList.clear();
      return this;
    }

    /**
     * <code>repeated .MazeMapData map_list = 2;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMapList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MazeMapDataOuterClass.MazeMapData> getMapList() {
      return mapList;
    }

    /**
     * <code>repeated .MazeMapData map_list = 2;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MazeMapDataOuterClass.MazeMapData> getMutableMapList() {
      bitField0_ |= 0x00000020;
      return mapList;
    }

    /**
     * <code>repeated .MazeMapData map_list = 2;</code>
     * @param value the mapList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addMapList(final MazeMapDataOuterClass.MazeMapData value) {
      bitField0_ |= 0x00000020;
      mapList.add(value);
      return this;
    }

    /**
     * <code>repeated .MazeMapData map_list = 2;</code>
     * @param values the mapList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addAllMapList(final MazeMapDataOuterClass.MazeMapData... values) {
      bitField0_ |= 0x00000020;
      mapList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .MazeProp maze_prop_list = 8;</code>
     * @return whether the mazePropList field is set
     */
    public boolean hasMazePropList() {
      return (bitField0_ & 0x00000040) != 0;
    }

    /**
     * <code>repeated .MazeProp maze_prop_list = 8;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearMazePropList() {
      bitField0_ &= ~0x00000040;
      mazePropList.clear();
      return this;
    }

    /**
     * <code>repeated .MazeProp maze_prop_list = 8;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMazePropList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MazePropOuterClass.MazeProp> getMazePropList() {
      return mazePropList;
    }

    /**
     * <code>repeated .MazeProp maze_prop_list = 8;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MazePropOuterClass.MazeProp> getMutableMazePropList() {
      bitField0_ |= 0x00000040;
      return mazePropList;
    }

    /**
     * <code>repeated .MazeProp maze_prop_list = 8;</code>
     * @param value the mazePropList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addMazePropList(final MazePropOuterClass.MazeProp value) {
      bitField0_ |= 0x00000040;
      mazePropList.add(value);
      return this;
    }

    /**
     * <code>repeated .MazeProp maze_prop_list = 8;</code>
     * @param values the mazePropList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addAllMazePropList(final MazePropOuterClass.MazeProp... values) {
      bitField0_ |= 0x00000040;
      mazePropList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .MazeGroup maze_group_list = 13;</code>
     * @return whether the mazeGroupList field is set
     */
    public boolean hasMazeGroupList() {
      return (bitField0_ & 0x00000080) != 0;
    }

    /**
     * <code>repeated .MazeGroup maze_group_list = 13;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearMazeGroupList() {
      bitField0_ &= ~0x00000080;
      mazeGroupList.clear();
      return this;
    }

    /**
     * <code>repeated .MazeGroup maze_group_list = 13;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableMazeGroupList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MazeGroupOuterClass.MazeGroup> getMazeGroupList() {
      return mazeGroupList;
    }

    /**
     * <code>repeated .MazeGroup maze_group_list = 13;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MazeGroupOuterClass.MazeGroup> getMutableMazeGroupList() {
      bitField0_ |= 0x00000080;
      return mazeGroupList;
    }

    /**
     * <code>repeated .MazeGroup maze_group_list = 13;</code>
     * @param value the mazeGroupList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addMazeGroupList(final MazeGroupOuterClass.MazeGroup value) {
      bitField0_ |= 0x00000080;
      mazeGroupList.add(value);
      return this;
    }

    /**
     * <code>repeated .MazeGroup maze_group_list = 13;</code>
     * @param values the mazeGroupList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addAllMazeGroupList(final MazeGroupOuterClass.MazeGroup... values) {
      bitField0_ |= 0x00000080;
      mazeGroupList.addAll(values);
      return this;
    }

    /**
     * <code>repeated .MazeChest unlocked_chest_list = 14;</code>
     * @return whether the unlockedChestList field is set
     */
    public boolean hasUnlockedChestList() {
      return (bitField0_ & 0x00000100) != 0;
    }

    /**
     * <code>repeated .MazeChest unlocked_chest_list = 14;</code>
     * @return this
     */
    public GetSceneMapInfoScRsp clearUnlockedChestList() {
      bitField0_ &= ~0x00000100;
      unlockedChestList.clear();
      return this;
    }

    /**
     * <code>repeated .MazeChest unlocked_chest_list = 14;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableUnlockedChestList()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedMessage<MazeChestOuterClass.MazeChest> getUnlockedChestList() {
      return unlockedChestList;
    }

    /**
     * <code>repeated .MazeChest unlocked_chest_list = 14;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedMessage<MazeChestOuterClass.MazeChest> getMutableUnlockedChestList() {
      bitField0_ |= 0x00000100;
      return unlockedChestList;
    }

    /**
     * <code>repeated .MazeChest unlocked_chest_list = 14;</code>
     * @param value the unlockedChestList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addUnlockedChestList(final MazeChestOuterClass.MazeChest value) {
      bitField0_ |= 0x00000100;
      unlockedChestList.add(value);
      return this;
    }

    /**
     * <code>repeated .MazeChest unlocked_chest_list = 14;</code>
     * @param values the unlockedChestList to add
     * @return this
     */
    public GetSceneMapInfoScRsp addAllUnlockedChestList(
        final MazeChestOuterClass.MazeChest... values) {
      bitField0_ |= 0x00000100;
      unlockedChestList.addAll(values);
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp copyFrom(final GetSceneMapInfoScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        entryId = other.entryId;
        curMapEntryId = other.curMapEntryId;
        unlockedTeleportList.copyFrom(other.unlockedTeleportList);
        lightenSectionList.copyFrom(other.lightenSectionList);
        mapList.copyFrom(other.mapList);
        mazePropList.copyFrom(other.mazePropList);
        mazeGroupList.copyFrom(other.mazeGroupList);
        unlockedChestList.copyFrom(other.unlockedChestList);
      }
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp mergeFrom(final GetSceneMapInfoScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasEntryId()) {
        setEntryId(other.entryId);
      }
      if (other.hasCurMapEntryId()) {
        setCurMapEntryId(other.curMapEntryId);
      }
      if (other.hasUnlockedTeleportList()) {
        getMutableUnlockedTeleportList().addAll(other.unlockedTeleportList);
      }
      if (other.hasLightenSectionList()) {
        getMutableLightenSectionList().addAll(other.lightenSectionList);
      }
      if (other.hasMapList()) {
        getMutableMapList().addAll(other.mapList);
      }
      if (other.hasMazePropList()) {
        getMutableMazePropList().addAll(other.mazePropList);
      }
      if (other.hasMazeGroupList()) {
        getMutableMazeGroupList().addAll(other.mazeGroupList);
      }
      if (other.hasUnlockedChestList()) {
        getMutableUnlockedChestList().addAll(other.unlockedChestList);
      }
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      entryId = 0;
      curMapEntryId = 0;
      unlockedTeleportList.clear();
      lightenSectionList.clear();
      mapList.clear();
      mazePropList.clear();
      mazeGroupList.clear();
      unlockedChestList.clear();
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      unlockedTeleportList.clear();
      lightenSectionList.clear();
      mapList.clearQuick();
      mazePropList.clearQuick();
      mazeGroupList.clearQuick();
      unlockedChestList.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof GetSceneMapInfoScRsp)) {
        return false;
      }
      GetSceneMapInfoScRsp other = (GetSceneMapInfoScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasEntryId() || entryId == other.entryId)
        && (!hasCurMapEntryId() || curMapEntryId == other.curMapEntryId)
        && (!hasUnlockedTeleportList() || unlockedTeleportList.equals(other.unlockedTeleportList))
        && (!hasLightenSectionList() || lightenSectionList.equals(other.lightenSectionList))
        && (!hasMapList() || mapList.equals(other.mapList))
        && (!hasMazePropList() || mazePropList.equals(other.mazePropList))
        && (!hasMazeGroupList() || mazeGroupList.equals(other.mazeGroupList))
        && (!hasUnlockedChestList() || unlockedChestList.equals(other.unlockedChestList));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 8);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRawByte((byte) 48);
        output.writeUInt32NoTag(entryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeRawByte((byte) 80);
        output.writeUInt32NoTag(curMapEntryId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        for (int i = 0; i < unlockedTeleportList.length(); i++) {
          output.writeRawByte((byte) 24);
          output.writeUInt32NoTag(unlockedTeleportList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000010) != 0) {
        for (int i = 0; i < lightenSectionList.length(); i++) {
          output.writeRawByte((byte) 72);
          output.writeUInt32NoTag(lightenSectionList.array()[i]);
        }
      }
      if ((bitField0_ & 0x00000020) != 0) {
        for (int i = 0; i < mapList.length(); i++) {
          output.writeRawByte((byte) 18);
          output.writeMessageNoTag(mapList.get(i));
        }
      }
      if ((bitField0_ & 0x00000040) != 0) {
        for (int i = 0; i < mazePropList.length(); i++) {
          output.writeRawByte((byte) 66);
          output.writeMessageNoTag(mazePropList.get(i));
        }
      }
      if ((bitField0_ & 0x00000080) != 0) {
        for (int i = 0; i < mazeGroupList.length(); i++) {
          output.writeRawByte((byte) 106);
          output.writeMessageNoTag(mazeGroupList.get(i));
        }
      }
      if ((bitField0_ & 0x00000100) != 0) {
        for (int i = 0; i < unlockedChestList.length(); i++) {
          output.writeRawByte((byte) 114);
          output.writeMessageNoTag(unlockedChestList.get(i));
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(entryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(curMapEntryId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        size += (1 * unlockedTeleportList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(unlockedTeleportList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        size += (1 * lightenSectionList.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(lightenSectionList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        size += (1 * mapList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(mapList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        size += (1 * mazePropList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(mazePropList);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        size += (1 * mazeGroupList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(mazeGroupList);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        size += (1 * unlockedChestList.length()) + ProtoSink.computeRepeatedMessageSizeNoTag(unlockedChestList);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public GetSceneMapInfoScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 8: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 48) {
              break;
            }
          }
          case 48: {
            // entryId
            entryId = input.readUInt32();
            bitField0_ |= 0x00000002;
            tag = input.readTag();
            if (tag != 80) {
              break;
            }
          }
          case 80: {
            // curMapEntryId
            curMapEntryId = input.readUInt32();
            bitField0_ |= 0x00000004;
            tag = input.readTag();
            if (tag != 26) {
              break;
            }
          }
          case 26: {
            // unlockedTeleportList [packed=true]
            input.readPackedUInt32(unlockedTeleportList, tag);
            bitField0_ |= 0x00000008;
            tag = input.readTag();
            if (tag != 74) {
              break;
            }
          }
          case 74: {
            // lightenSectionList [packed=true]
            input.readPackedUInt32(lightenSectionList, tag);
            bitField0_ |= 0x00000010;
            tag = input.readTag();
            if (tag != 18) {
              break;
            }
          }
          case 18: {
            // mapList
            tag = input.readRepeatedMessage(mapList, tag);
            bitField0_ |= 0x00000020;
            if (tag != 66) {
              break;
            }
          }
          case 66: {
            // mazePropList
            tag = input.readRepeatedMessage(mazePropList, tag);
            bitField0_ |= 0x00000040;
            if (tag != 106) {
              break;
            }
          }
          case 106: {
            // mazeGroupList
            tag = input.readRepeatedMessage(mazeGroupList, tag);
            bitField0_ |= 0x00000080;
            if (tag != 114) {
              break;
            }
          }
          case 114: {
            // unlockedChestList
            tag = input.readRepeatedMessage(unlockedChestList, tag);
            bitField0_ |= 0x00000100;
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
          case 24: {
            // unlockedTeleportList [packed=false]
            tag = input.readRepeatedUInt32(unlockedTeleportList, tag);
            bitField0_ |= 0x00000008;
            break;
          }
          case 72: {
            // lightenSectionList [packed=false]
            tag = input.readRepeatedUInt32(lightenSectionList, tag);
            bitField0_ |= 0x00000010;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeUInt32(FieldNames.entryId, entryId);
      }
      if ((bitField0_ & 0x00000004) != 0) {
        output.writeUInt32(FieldNames.curMapEntryId, curMapEntryId);
      }
      if ((bitField0_ & 0x00000008) != 0) {
        output.writeRepeatedUInt32(FieldNames.unlockedTeleportList, unlockedTeleportList);
      }
      if ((bitField0_ & 0x00000010) != 0) {
        output.writeRepeatedUInt32(FieldNames.lightenSectionList, lightenSectionList);
      }
      if ((bitField0_ & 0x00000020) != 0) {
        output.writeRepeatedMessage(FieldNames.mapList, mapList);
      }
      if ((bitField0_ & 0x00000040) != 0) {
        output.writeRepeatedMessage(FieldNames.mazePropList, mazePropList);
      }
      if ((bitField0_ & 0x00000080) != 0) {
        output.writeRepeatedMessage(FieldNames.mazeGroupList, mazeGroupList);
      }
      if ((bitField0_ & 0x00000100) != 0) {
        output.writeRepeatedMessage(FieldNames.unlockedChestList, unlockedChestList);
      }
      output.endObject();
    }

    @Override
    public GetSceneMapInfoScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1591558867:
          case -2093663224: {
            if (input.isAtField(FieldNames.entryId)) {
              if (!input.trySkipNullValue()) {
                entryId = input.readUInt32();
                bitField0_ |= 0x00000002;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 764919441:
          case 2115673898: {
            if (input.isAtField(FieldNames.curMapEntryId)) {
              if (!input.trySkipNullValue()) {
                curMapEntryId = input.readUInt32();
                bitField0_ |= 0x00000004;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 856936684:
          case -10753834: {
            if (input.isAtField(FieldNames.unlockedTeleportList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(unlockedTeleportList);
                bitField0_ |= 0x00000008;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -1942343836:
          case 1328850360: {
            if (input.isAtField(FieldNames.lightenSectionList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(lightenSectionList);
                bitField0_ |= 0x00000010;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 836484122:
          case 178830753: {
            if (input.isAtField(FieldNames.mapList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(mapList);
                bitField0_ |= 0x00000020;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1676123008:
          case 1875839866: {
            if (input.isAtField(FieldNames.mazePropList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(mazePropList);
                bitField0_ |= 0x00000040;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -317054274:
          case 407435998: {
            if (input.isAtField(FieldNames.mazeGroupList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(mazeGroupList);
                bitField0_ |= 0x00000080;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case -337762404:
          case 231688696: {
            if (input.isAtField(FieldNames.unlockedChestList)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedMessage(unlockedChestList);
                bitField0_ |= 0x00000100;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public GetSceneMapInfoScRsp clone() {
      return new GetSceneMapInfoScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static GetSceneMapInfoScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoScRsp(), data).checkInitialized();
    }

    public static GetSceneMapInfoScRsp parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoScRsp(), input).checkInitialized();
    }

    public static GetSceneMapInfoScRsp parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new GetSceneMapInfoScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating GetSceneMapInfoScRsp messages
     */
    public static MessageFactory<GetSceneMapInfoScRsp> getFactory() {
      return GetSceneMapInfoScRspFactory.INSTANCE;
    }

    private enum GetSceneMapInfoScRspFactory implements MessageFactory<GetSceneMapInfoScRsp> {
      INSTANCE;

      @Override
      public GetSceneMapInfoScRsp create() {
        return GetSceneMapInfoScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName entryId = FieldName.forField("entryId", "entry_id");

      static final FieldName curMapEntryId = FieldName.forField("curMapEntryId", "cur_map_entry_id");

      static final FieldName unlockedTeleportList = FieldName.forField("unlockedTeleportList", "unlocked_teleport_list");

      static final FieldName lightenSectionList = FieldName.forField("lightenSectionList", "lighten_section_list");

      static final FieldName mapList = FieldName.forField("mapList", "map_list");

      static final FieldName mazePropList = FieldName.forField("mazePropList", "maze_prop_list");

      static final FieldName mazeGroupList = FieldName.forField("mazeGroupList", "maze_group_list");

      static final FieldName unlockedChestList = FieldName.forField("unlockedChestList", "unlocked_chest_list");
    }
  }
}
