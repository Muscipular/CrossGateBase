package cg.base.wayFinder;

import java.util.List;

import cg.base.map.MapCell;
import cg.base.sprite.Unit;
import cg.base.util.UnitUtil;

class SimpleWayFinder extends CWayFinder {

	@Override
	protected void find0(int sourceEast, int sourceSouth, int targetEast, int targetSouth, List<MapCell> way) {
		if (sourceSouth != targetSouth || sourceEast != targetEast) {
			switch (UnitUtil.calcDir(sourceEast, sourceSouth, targetEast, targetSouth)) {
			case Unit.DIR_EAST : // ��
				for (int i = 1, loop = targetEast - sourceEast;i <= loop;i++) {
					MapCell mapCell = map.getMapCell(sourceEast + i, sourceSouth);
					if (canGo(mapCell)) {
						way.add(mapCell);
					} else {
						break;
					}
				}
				break;
			case Unit.DIR_SOUTH : // ��
				for (int i = 1, loop = targetSouth - sourceSouth;i <= loop;i++) {
					MapCell mapCell = map.getMapCell(sourceEast, sourceSouth + i);
					if (canGo(mapCell)) {
						way.add(mapCell);
					} else {
						break;
					}
				}
				break;
			case Unit.DIR_SOUTH_EAST : { // ����
				MapCell mapCell = checkBeveled(map.getMapCell(sourceEast, sourceSouth + 1), 
						map.getMapCell(sourceEast + 1, sourceSouth), 
						map.getMapCell(sourceEast + 1, sourceSouth + 1));
				if (mapCell != null) {
					way.add(mapCell);
					find0(mapCell.getEast(), mapCell.getSouth(), targetEast, targetSouth, way);
				}
				break;
			}
			case Unit.DIR_SOUTH_WEST : { // ����
				MapCell mapCell = checkBeveled(map.getMapCell(sourceEast, sourceSouth + 1), 
						map.getMapCell(sourceEast - 1, sourceSouth), 
						map.getMapCell(sourceEast - 1, sourceSouth + 1));
				if (mapCell != null) {
					way.add(mapCell);
					find0(mapCell.getEast(), mapCell.getSouth(), targetEast, targetSouth, way);
				}
				break;
			}
			case Unit.DIR_NORTH : // ��
				for (int i = 1, loop = sourceSouth - targetSouth;i <= loop;i++) {
					MapCell mapCell = map.getMapCell(sourceEast, sourceSouth - i);
					if (canGo(mapCell)) {
						way.add(mapCell);
					} else {
						break;
					}
				}
				break;
			case Unit.DIR_NORTH_EAST : { // ����
				MapCell mapCell = checkBeveled(map.getMapCell(sourceEast, sourceSouth - 1), 
						map.getMapCell(sourceEast + 1, sourceSouth), 
						map.getMapCell(sourceEast + 1, sourceSouth - 1));
				if (mapCell != null) {
					way.add(mapCell);
					find0(mapCell.getEast(), mapCell.getSouth(), targetEast, targetSouth, way);
				}
				break;
			}
			case Unit.DIR_NORTH_WEST : { // ����
				MapCell mapCell = checkBeveled(map.getMapCell(sourceEast, sourceSouth - 1), 
						map.getMapCell(sourceEast - 1, sourceSouth), 
						map.getMapCell(sourceEast - 1, sourceSouth - 1));
				if (mapCell != null) {
					way.add(mapCell);
					find0(mapCell.getEast(), mapCell.getSouth(), targetEast, targetSouth, way);
				}
				break;
			}
			case Unit.DIR_WEST : // ��
				for (int i = 1, loop = sourceEast - targetEast;i <= loop;i++) {
					MapCell mapCell = map.getMapCell(sourceEast - i, sourceSouth);
					if (canGo(mapCell)) {
						way.add(mapCell);
					} else {
						break;
					}
				}
				break;
			}
		}
	}

}
